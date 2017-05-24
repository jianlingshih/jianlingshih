<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.lxm.bbs.dao.entity.*,com.lxm.bbs.dao.*,com.lxm.bbs.dao.impl.*,java.util.*"%>
<%
request.setCharacterEncoding("utf-8");
String userName=request.getParameter("userName");
String userPass=request.getParameter("userPass");
int sex=Integer.parseInt(request.getParameter("sex"));
String head=request.getParameter("radio");


int flag=0;
User user=new User();
user.setUName(userName);
user.setUPass(userPass);
user.setGender(sex);
user.setHead(head);
UserDao userDao=new UserDaoImpl();
flag=userDao.addUser(user);
if(flag>0){
	response.sendRedirect("../index.jsp");
	
	}else{
		
		response.sendRedirect("../reg.jsp");
	}





%>