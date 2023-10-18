package com.saeyan.controller.action.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.controller.action.Action;
import com.saeyan.dao.ReplyDAO;
import com.saeyan.dto.ReplyVO;

public class BoardReplyList implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReplyDAO rDao = ReplyDAO.getInstance();
		ReplyVO rVo = new ReplyVO();
		
		int num = Integer.parseInt(request.getParameter("rno"));
		String userid = request.getParameter("userid");
		String content = request.getParameter("content");
		rVo.setRno(num);
		rVo.setUserid(userid);
		rVo.setContents(content);
		rDao.insertBoardReply(rVo);
		
		
		response.sendRedirect("BoardServlet?command=board_view&num="+num);
	}

}