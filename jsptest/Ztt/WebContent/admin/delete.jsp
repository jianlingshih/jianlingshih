<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.lxm.bbs.dao.entity.*,com.lxm.bbs.dao.*,com.lxm.bbs.dao.impl.*,java.util.*"%>
<%
	request.setCharacterEncoding("utf-8");
	//不管在什么情况下·有没有中文的接收我们必须设置他的request的setCharacterEncoding方法
	ReplyDao replyDao =new ReplyDaoImpl();
	int uId=Integer.parseInt(request.getParameter("uId"));
	int boardId=Integer.parseInt(request.getParameter("boardId"));
	int topicId=Integer.parseInt(request.getParameter("topicId"));
	int replyId=Integer.parseInt(request.getParameter("replyId"));
	User user2=null;
	int flag=0;
	if(session.getAttribute("users")!=null){
	user2=(User)session.getAttribute("users");
	
	}else{
		user2=new User();
		response.sendRedirect("../login.jsp");
	}
	if(user2.getUId()!=uId){
		out.print("<script type='text/javascript'>alert('您无权删除该用户帖子');location.replace('../index.jsp')</script>");
	}else{

		flag=replyDao.deleteReply(replyId);
		if(flag>0){
			response.sendRedirect("../detail.jsp?page=1&boardId="+boardId+"&topicId="+topicId+"&uId="+uId);
		}
	}
%>
