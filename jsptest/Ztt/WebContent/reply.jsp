<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page
	import="com.lxm.bbs.dao.entity.*,com.lxm.bbs.dao.*,com.lxm.bbs.dao.impl.*,java.util.*"%>
<% 
	int topicId=Integer.parseInt(request.getParameter("topicId"));
	int boardId=Integer.parseInt(request.getParameter("boardId"));
	User user2=null;
	if(session.getAttribute("users")!=null){
	user2=(User)session.getAttribute("users");
	}else{
		user2=new User();
		response.sendRedirect("login.jsp");
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>回复主题-ACCP教程网论坛</title>
<link rel="stylesheet" type="text/css" href="img/style.css"/>
<script type="text/javascript">
function login()
{
	var title=document.postForm.title.value;
	var content =FCKeditorAPI.GetInstance("content").GetXHTML(); 
	if(title==""||title==null)
	{
		alert("标题不能为空");
		return false;
	}else if(content==""||content==null)
	{
		alert("内容不能为空");
		return false;
	}else
	{
		return true;
	}
}
</script>
<script type="text/javascript" src="fckeditor/fckeditor.js"></script>
	<script type="text/javascript">

window.onload = function()
{
	
	var sBasePath = document.location.href.substring(0,document.location.href.lastIndexOf('_samples')) ;

	var oFCKeditor = new FCKeditor( 'content' ) ;
	oFCKeditor.Width='100%';
	oFCKeditor.Height='500';
	oFCKeditor.ToolbarSet='diy';
	oFCKeditor.BasePath	= 'fckeditor/' ;
	oFCKeditor.ReplaceTextarea() ;
}

	</script>
 
	
</head>

<body>
<div class="main w">
<%@ include file="head.html" %> 
<div class="menu w">
<span><a href="index.jsp">论坛首页</a> - <a href="post.jsp">发布帖子</a></span>
</div>
<div class="reg w">
<form name="postForm" method="post" action="admin/doReply.jsp" onsubmit="return login()">
<input type="hidden" name="topicId" value="<%=topicId %>" />
<input type="hidden" name="uId" value="<%=user2.getUId() %>" />
<input type="hidden" name="boardId" value="<%=boardId %>" />
<table width="100%" border="0">
  <tr>
    <td width="6%">标题：</td>
    <td width="94%">
      <input type="text" name="title"  style="width:70%" /></td>
  </tr>
  <tr>
    <td>内容</td>
    <td><textarea name="content" style="width:100%; height:600px;"></textarea></td>
  </tr>
  <tr>
    <td colspan="2" align="center"><input name="" type="submit" value="提交" /><input name="input" type="reset" value="重置" /></td>
    </tr>
</table>
</form>
</div>
</div><!--main end-->
<%@ include file="foot.html" %> 
</body>
</html>