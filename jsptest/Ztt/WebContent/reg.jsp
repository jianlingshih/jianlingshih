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
function reg(){
	var name=document.regform.userName.value;
	var pass=document.regform.userPass.value;
	var pass2=document.regform.userPass2.value;
	if(name==""||name==null){
		alert("用户名不能为空");
		return false;
		
		}else if(pass==""||pass==null)
			{
			alert("密码不能为空");
			return false;
			
			}else if(pass2!=pass){
				alert("密码不相等");
				return false;
				
				
			}
	
	
}


</script>
</head>
<body>
	<div class="main w">
		<%@ include file="head.html" %>
		<div class="menu w">
			<span><a href="login.jsp">论坛首页</a>><a href="reg.jsp">注册页面</a></span>

		</div>
		<div class="reg w">
			<div style="width: 898px; margin-left: 300px; margin-top: 50px;">
				<form name="regform" action="admin/doReg.jsp" method="post"
					onsubmit="return reg()">
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
							<td>重复密码：</td>
							<td><input type="password" name="userPass2" /></td>
						</tr>
						<tr>
							<td>性别：</td>
							<td><input type="radio" name="sex" id="radio"
								value="1" />帅哥 <input type="radio" name="radio" id="radio"
								value="2" />美女</td>


						</tr>
						<tr><td>选择头像</td>
						<td></td>
						</tr>
					</table>
					<div style="300px">
							<input type="radio" name="radio"  value="1.gif" checked="checked"/>
							<img src="img/head/1.gif" width="70" height="70" alt="1" />
							<input type="radio" name="radio"   value="2.gif"  />
							<img src="img/head/2.gif" width="70" height="70" alt="2" />
							<input type="radio" name="radio"   value="3.gif" />
							<img src="img/head/3.gif" width="70" height="70" alt="3" />
							<input type="radio" name="radio"   value="4.gif" />
							<img src="img/head/4.gif" width="70" height="70" alt="4" />
							<input type="radio" name="radio"   value="5.gif" />
							<img src="img/head/5.gif" width="70" height="70" alt="5" /><br />
							<input type="radio" name="radio"   value="6.gif" />
							<img src="img/head/6.gif" width="70" height="70" alt="6" />
							<input type="radio" name="radio"   value="7.gif" />
							<img src="img/head/7.gif" width="70" height="70" alt="7" />
							<input type="radio" name="radio"   value="8.gif" />
							<img src="img/head/8.gif" width="70" height="70" alt="8" />
							<input type="radio" name="radio"   value="9.gif" />
							<img src="img/head/9.gif" width="70" height="70" alt="9" />
							<input type="radio" name="radio"   value="10.gif" />
							<img src="img/head/10.gif" width="70" height="70" alt="10" /><br />
							<input type="radio" name="radio"   value="11.gif" />
							<img src="img/head/11.gif" width="70" height="70" alt="11" />
							<input type="radio" name="radio"   value="12.gif" />
							<img src="img/head/12.gif" width="70" height="70" alt="12" />
							<input type="radio" name="radio"  value="13.gif" />
							<img src="img/head/13.gif" width="70" height="70" alt="13" />
							<input type="radio" name="radio"   value="14.gif" />
							<img src="img/head/14.gif" width="70" height="70" alt="14" />
							<input type="radio" name="radio"   value="15.gif" />
							<img src="img/head/15.gif" width="70" height="70" alt="15" />
							
							
					</div>
					<div style="margin-top:10px;"><input type="submit" name="button" value="注册" />
					<input type="submit" name="button" value="重置" /></div>
					
					<div style="height:20px;"></div>
					
				</form>
			</div>
		</div>

	</div>
	<!-- main end -->
	<%@ include file="foot.html" %>
</body>
</html>