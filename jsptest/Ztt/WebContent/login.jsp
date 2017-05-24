<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page
	import="com.lxm.bbs.dao.entity.*,com.lxm.bbs.dao.*,com.lxm.bbs.dao.impl.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="img/style.css" />
<script type="text/javascript">
function login(){
	var name=document.regform.userName.value;
	var pass=document.regform.userPass.value;
	if(name==""||name==null){
		alert("用户名不能为空");
		return false;
		
		}else if(pass==""||pass==null)
			{
			alert("密码不能为空");
			return false;
			
			}else{
				return true;
				
				
			}
	
	
}


</script>
</head>
<body>
	<div class="main w">
		<%@ include file="head.html" %>
		<div class="menu w">
			<span><a href="index.jsp">论坛首页</a>><a href=" login.jsp">登录页面</a></span>

		</div>
		<div class="reg w">
			<div style="width: 898px; margin-left: 300px; margin-top: 50px;">
				<form name="regform" action="admin/doLogin.jsp" method="post"
					onsubmit="return login()">
					<table>
						<tr>
							<td>用户名：</td>
							<td><input type="text" name="userName" /></td>
						</tr>
						<tr>
							<td>密码：</td>
							<td><input type="password" name="userPass" /></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td><input type="submit" name="button" value="登陆" /></td>
						</tr>
						
					</table>
					
					
				</form>
			</div>
		</div>

	</div>
	<!-- main end -->
	<%@ include file="foot.html" %>
</body>
</html>