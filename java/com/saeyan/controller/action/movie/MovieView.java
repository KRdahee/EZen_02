package com.saeyan.controller.action.movie;

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
import com.saeyan.dto.MovieVO;
import com.saeyan.dto.ReplyVO;

public class MovieView implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/movie/MovieView.jsp";
		String num = request.getParameter("num");
		
		
		MovieDAO bDao = MovieDAO.getInstance();
		MovieVO pVo = bDao.selectOneMovieByNum(num);
		List<MovieVO> LpVo = new ArrayList<>();
		LpVo.add(pVo);
		request.setAttribute("MovieVO", LpVo);
		System.out.println("32132132132131232321312");
		ReplyDAO rDao = ReplyDAO.getInstance();
		String rptitle = pVo.getTitle();
		List<ReplyVO> replyList = rDao.selectReplyByCode(rptitle);
		System.out.println("1111@221221221221211212");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("1111@221221221221211212");
		int count = 0;
		for(ReplyVO list : replyList) {
			count++; 
		}
		
		request.setAttribute("title", rptitle);
		request.setAttribute("count", count);
		request.setAttribute("replyList", replyList);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
