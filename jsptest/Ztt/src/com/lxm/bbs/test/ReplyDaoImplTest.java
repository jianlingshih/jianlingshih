package com.lxm.bbs.test;

import java.util.List;

import com.lxm.bbs.dao.ReplyDao;
import com.lxm.bbs.dao.entity.Reply;
import com.lxm.bbs.dao.impl.ReplyDaoImpl;

public class ReplyDaoImplTest {
	public static void main(String[] args) {
		/*
		 * int flag = 0; ReplyDao replyDao = new ReplyDaoImpl(); Reply reply =
		 * new Reply(); reply.setTitle("今天去学校游泳馆");
		 * reply.setContent("我也看到了小吃摊"); reply.setUId(6); reply.setTopicId(2);
		 * flag = replyDao.addReply(reply); if (flag > 0) {
		 * 
		 * System.out.println("回复主题成功"); } else { System.out.println("回复主题失败");
		 * }
		 */
		/*
		 * int flag = 0; ReplyDao replyDao = new ReplyDaoImpl(); flag =
		 * replyDao.deleteReply(2); if (flag > 0) {
		 * 
		 * System.out.println("删除回复成功"); } else { System.out.println("删除回复失败");
		 * }
		 */
		/*
		 * ReplyDao replyDao = new ReplyDaoImpl(); List
		 * replyList=replyDao.findListReply(1, 2); for(int
		 * i=0;i<replyList.size();i++){ Reply reply=(Reply)replyList.get(i);
		 * System.out.println("========回复信息=======");
		 * System.out.println("回复标题"+reply.getTitle());
		 * System.out.println("回复内容"+reply.getContent());
		 * System.out.println("回复时间"+reply.getPublishTime()); }
		 */
		/*
		 * int flag=0; ReplyDao replyDao = new ReplyDaoImpl(); Reply reply=new
		 * Reply(); reply.setTitle("今天去隔壁学校游泳馆");
		 * reply.setContent("我看到了小吃摊，还有卖气球的"); reply.setReplyId(1);
		 * flag=replyDao.updateReply(reply); if (flag > 0) {
		 * 
		 * System.out.println("修改回复成功"); } else { System.out.println("修改回复失败");
		 * }
		 */
		/*
		 * int flag=0; ReplyDao replyDao = new ReplyDaoImpl(); Reply reply=new
		 * Reply(); reply.setTitle("今天去隔壁学校游泳馆");
		 * reply.setContent("我看到了小吃摊，还有卖气球的"); reply.setReplyId(1);
		 * flag=replyDao.updateReply(reply); if (flag > 0) {
		 * 
		 * System.out.println("修改回复成功"); } else { System.out.println("修改回复失败");
		 * }
		 */
		int flag = 0;
		ReplyDao replyDao = new ReplyDaoImpl();
		// flag=replyDao.findCountReply(3);
		// System.out.println("回复数为："+flag);
		Reply reply = replyDao.findReply(1);
		System.out.println("---------回复信息--------");
		System.out.println("回复标题" + reply.getTitle());
		System.out.println("回复内容" + reply.getContent());
		System.out.println("回复时间" + reply.getPublishTime());

	}
}
