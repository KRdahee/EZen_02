package com.saeyan.controller.action.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.controller.action.Action;
import com.saeyan.dao.ReplyDAO;
import com.saeyan.dto.ReplyVO;

public class DeleteReplyBoard implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int rno = Integer.parseInt(request.getParameter("num"));
		String userid = request.getParameter("replyuserid");
		String contents = request.getParameter("replycontents");
		int code = Integer.parseInt(request.getParameter("replycode"));
		
		ReplyDAO rDAO = ReplyDAO.getInstance();
		ReplyVO rVo = new ReplyVO();
		rVo.setRno(rno);
		rVo.setUserid(userid);
		rVo.setContents(contents);
		rVo.setCode(code);
		
		rDAO.DeleteReplyBoard(rVo);
		
		response.sendRedirect("BoardServlet?command=board_view&num="+rno);
		
		
	}

}
