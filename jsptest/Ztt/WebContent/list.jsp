<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page
	import="com.lxm.bbs.dao.entity.*,com.lxm.bbs.dao.*,com.lxm.bbs.dao.impl.*,java.util.*"%>
<%
	TopicDao topicDao = new TopicDaoImpl();
	int p = 1;
	int boardId = 4;
	if (request.getParameter("page") != null
			&& request.getParameter("boardId") != null) {
		p = Integer.parseInt(request.getParameter("page"));
		boardId = Integer.parseInt(request.getParameter("boardId"));
	}
	List listTopic = topicDao.findListTopic(p, boardId);
	BoardDao boardDao = new BoardDaoImpl();
	Board board = boardDao.findBoard(boardId);
	User user2 = null;
	if (session.getAttribute("users") != null) {
		user2 = (User) session.getAttribute("users");
	} else {
		user2 = new User();
	}
	int up = p;
	int down = p;
	if (listTopic.size() == 20) {
		down = p + 1;

	}
	if (p > 1) {
		up = p - 1;
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><%=board.getBoardTitle()%>--ZTE技术论坛</title>
<link rel="stylesheet" type="text/css" href="img/style.css" />
</head>
<body>
	<div class="main w">
		<%@ include file="head.html"%>
		<div class="menu w">
			<span><a href="login.jsp">论坛首页</a>><a
				href="list.jsp?page=1&boardId=<%=boardId%>"><%=board.getBoardTitle()%></a></span>

		</div>

		<div class="page w">
			<div class="fy">
				<a href="list.jsp?page=<%=up%>&boardId=<%=boardId%>">上一页 </a>|<a
					href="list.jsp?page=<%=down%>&boardId=<%=boardId%>"> 下一页</a>
			</div>

			<div class="post">
				<a href="post.jsp?boardId=<%=boardId%>"><img src="img/post.gif"
					alt="发表话题" /></a>
			</div>

		</div>
		<!-- page end -->
		<div class="body1 w">
			<div class="title">
				<span style="margin-left: 350px">文章</span> <span
					style="margin-left: 350px">作者</span> <span
					style="margin-left: 70px">回复</span>
			</div>
			<div class="list">
				<div class="board w"></div>
				<%
					User user = new User();
					UserDao userDao = new UserDaoImpl();
					ReplyDao replyDao = new ReplyDaoImpl();
					int count = 0;

					for (int i = 0; i < listTopic.size(); i++) {
						Topic topic = (Topic) listTopic.get(i);
						user = userDao.findUser(topic.getUId());
						count = replyDao.findCountReply(topic.getTopicId());
				%>


				<div class="topic">

					<div class="item">
						<a
							href="detail.jsp?page=1&boardId=<%=boardId%>&topicId=<%=topic.getTopicId()%>&uId=<%=topic.getUId()%>"><%=topic.getTitle()%></a>
					</div>
					<div class="zj"><%=user.getUName()%></div>
					<div class="hf"><%=count %></div>

				</div>

				<%
					}
				%>


			</div>
			<!-- list end -->
		</div>
		<!-- body1 -->

		<div class="page w">
			<div class="fy">
				<a href="list.jsp?page=<%=up%>&boardId=<%=boardId%>">上一页 </a>|<a
					href="list.jsp?page=<%=down%>&boardId=<%=boardId%>"> 下一页</a>
			</div>



		</div>
		<!-- page end -->

	</div>
	<!-- main end -->
	<%@ include file="foot.html"%>
</body>
</html>