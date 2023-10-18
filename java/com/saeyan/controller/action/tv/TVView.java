package com.saeyan.controller.action.tv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.controller.action.Action;
import com.saeyan.dao.MovieDAO;
import com.saeyan.dao.ReplyDAO;
import com.saeyan.dao.TVDAO;
import com.saeyan.dto.MovieVO;
import com.saeyan.dto.ReplyVO;
import com.saeyan.dto.TVVO;

public class TVView implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/tv/tvView.jsp";
		String num = request.getParameter("num");
		
		
		TVDAO bDao = TVDAO.getInstance();
		TVVO pVo = bDao.selectTVByNum(num);
		List<TVVO> LpVo = new ArrayList<>(); 
		LpVo.add(pVo);
		request.setAttribute("tv", LpVo);
		String pVotitle = pVo.getTitle();
		ReplyDAO rDao = ReplyDAO.getInstance();
		List<ReplyVO> replyList = rDao.selectReplyByCode(pVotitle);
		int count = 0;
		for(ReplyVO list : replyList) {
			count++; 
		}
		
		request.setAttribute("title", pVotitle);
		request.setAttribute("count", count);
		request.setAttribute("replyList", replyList);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
