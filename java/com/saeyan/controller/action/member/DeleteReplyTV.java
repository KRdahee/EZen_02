package com.saeyan.controller.action.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.controller.action.Action;
import com.saeyan.dao.ReplyDAO;
import com.saeyan.dto.ReplyVO;

public class DeleteReplyTV implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("movietitle");
		String userid = request.getParameter("replyuserid");
		String contents = request.getParameter("replycontents");
		int code = Integer.parseInt(request.getParameter("replycode"));
		String num = request.getParameter("num");
		
		ReplyDAO rDAO = ReplyDAO.getInstance();
		ReplyVO rVo = new ReplyVO();
		rVo.setTitle(title);
		rVo.setUserid(userid);
		rVo.setContents(contents);
		rVo.setCode(code);
		rVo.setTitle(title);
		
		rDAO.DeleteReply(rVo);
		
		response.sendRedirect("BoardServlet?command=tv_view&num="+num);
		
		
	}

}
