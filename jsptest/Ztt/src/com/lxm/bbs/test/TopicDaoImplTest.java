package com.lxm.bbs.test;

import java.util.List;

import com.lxm.bbs.dao.TopicDao;
import com.lxm.bbs.dao.entity.Topic;
import com.lxm.bbs.dao.impl.TopicDaoImpl;

public class TopicDaoImplTest {
	public static void main(String[] args) {
		/*
		 * TopicDao topicDao=new TopicDaoImpl(); List
		 * listTopic=topicDao.findListTopic(1,2); for (int i = 0; i <
		 * listTopic.size(); i++) { Topic topic=(Topic)listTopic.get(i);
		 * System.out.println("========�����б�======");
		 * System.out.println(topic.getTitle());
		 * System.out.println(topic.getContent());
		 * System.out.println(topic.getPublishTime()); }
		 */
		/*
		 * int flag=0; TopicDao topicDao=new TopicDaoImpl(); Topic topic=new
		 * Topic(); topic.setTitle("����Ҫ��ʲô"); topic.setContent("һ����ȥ�ٳ��ܲ�");
		 * topic.setUId(8); topic.setBoardId(3); flag=topicDao.addTopic(topic);
		 * if(flag>0){ System.out.println("�������ɹ�");
		 * 
		 * 
		 * }else{
		 * 
		 * System.out.println("�������ʧ��");
		 * 
		 * }
		 */
		/*
		 * int flag=0; TopicDao topicDao=new TopicDaoImpl(); Topic
		 * topic=topicDao.findTopic(2);
		 * System.out.println("�������"+topic.getTitle());
		 * System.out.println("��������"+topic.getContent());
		 * System.out.println("����ʱ��"+topic.getPublishTime());
		 */
		/*int flag = 0;
		TopicDao topicDao = new TopicDaoImpl();
		Topic topic = new Topic();
		topic.setTitle("����ȥѧУ��Ӿ��");
		topic.setContent(";�п����˺ö�С��̯����˳�����˵�");
		topic.setTopicId(2);
		flag = topicDao.updateTopic(topic);
		if (flag > 0) {

			System.out.println("�޸�����ɹ�");
		} else {
			System.out.println("�޸�����ʧ��");
		}*/
		/*int flag=0;
		TopicDao topicDao = new TopicDaoImpl();
		flag=topicDao.findCountTopic(2);
		System.out.println("�������У�"+flag);*/
		int flag=0;
		TopicDao topicDao = new TopicDaoImpl();
		flag=topicDao.deleteTopic(4);
		if (flag > 0) {

			System.out.println("ɾ������ɹ�");
		} else {
			System.out.println("ɾ������ʧ��");
		}
	}

}
