package com.lxm.bbs.test;

import java.util.List;

import com.lxm.bbs.dao.ReplyDao;
import com.lxm.bbs.dao.entity.Reply;
import com.lxm.bbs.dao.impl.ReplyDaoImpl;

public class ReplyDaoImplTest {
	public static void main(String[] args) {
		/*
		 * int flag = 0; ReplyDao replyDao = new ReplyDaoImpl(); Reply reply =
		 * new Reply(); reply.setTitle("����ȥѧУ��Ӿ��");
		 * reply.setContent("��Ҳ������С��̯"); reply.setUId(6); reply.setTopicId(2);
		 * flag = replyDao.addReply(reply); if (flag > 0) {
		 * 
		 * System.out.println("�ظ�����ɹ�"); } else { System.out.println("�ظ�����ʧ��");
		 * }
		 */
		/*
		 * int flag = 0; ReplyDao replyDao = new ReplyDaoImpl(); flag =
		 * replyDao.deleteReply(2); if (flag > 0) {
		 * 
		 * System.out.println("ɾ���ظ��ɹ�"); } else { System.out.println("ɾ���ظ�ʧ��");
		 * }
		 */
		/*
		 * ReplyDao replyDao = new ReplyDaoImpl(); List
		 * replyList=replyDao.findListReply(1, 2); for(int
		 * i=0;i<replyList.size();i++){ Reply reply=(Reply)replyList.get(i);
		 * System.out.println("========�ظ���Ϣ=======");
		 * System.out.println("�ظ�����"+reply.getTitle());
		 * System.out.println("�ظ�����"+reply.getContent());
		 * System.out.println("�ظ�ʱ��"+reply.getPublishTime()); }
		 */
		/*
		 * int flag=0; ReplyDao replyDao = new ReplyDaoImpl(); Reply reply=new
		 * Reply(); reply.setTitle("����ȥ����ѧУ��Ӿ��");
		 * reply.setContent("�ҿ�����С��̯�������������"); reply.setReplyId(1);
		 * flag=replyDao.updateReply(reply); if (flag > 0) {
		 * 
		 * System.out.println("�޸Ļظ��ɹ�"); } else { System.out.println("�޸Ļظ�ʧ��");
		 * }
		 */
		/*
		 * int flag=0; ReplyDao replyDao = new ReplyDaoImpl(); Reply reply=new
		 * Reply(); reply.setTitle("����ȥ����ѧУ��Ӿ��");
		 * reply.setContent("�ҿ�����С��̯�������������"); reply.setReplyId(1);
		 * flag=replyDao.updateReply(reply); if (flag > 0) {
		 * 
		 * System.out.println("�޸Ļظ��ɹ�"); } else { System.out.println("�޸Ļظ�ʧ��");
		 * }
		 */
		int flag = 0;
		ReplyDao replyDao = new ReplyDaoImpl();
		// flag=replyDao.findCountReply(3);
		// System.out.println("�ظ���Ϊ��"+flag);
		Reply reply = replyDao.findReply(1);
		System.out.println("---------�ظ���Ϣ--------");
		System.out.println("�ظ�����" + reply.getTitle());
		System.out.println("�ظ�����" + reply.getContent());
		System.out.println("�ظ�ʱ��" + reply.getPublishTime());

	}
}
