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
		 * System.out.println("========主题列表======");
		 * System.out.println(topic.getTitle());
		 * System.out.println(topic.getContent());
		 * System.out.println(topic.getPublishTime()); }
		 */
		/*
		 * int flag=0; TopicDao topicDao=new TopicDaoImpl(); Topic topic=new
		 * Topic(); topic.setTitle("明天要做什么"); topic.setContent("一大早去操场跑步");
		 * topic.setUId(8); topic.setBoardId(3); flag=topicDao.addTopic(topic);
		 * if(flag>0){ System.out.println("添加主题成功");
		 * 
		 * 
		 * }else{
		 * 
		 * System.out.println("添加主题失败");
		 * 
		 * }
		 */
		/*
		 * int flag=0; TopicDao topicDao=new TopicDaoImpl(); Topic
		 * topic=topicDao.findTopic(2);
		 * System.out.println("主题标题"+topic.getTitle());
		 * System.out.println("主题内容"+topic.getContent());
		 * System.out.println("发布时间"+topic.getPublishTime());
		 */
		/*int flag = 0;
		TopicDao topicDao = new TopicDaoImpl();
		Topic topic = new Topic();
		topic.setTitle("今天去学校游泳馆");
		topic.setContent("途中看到了好多小吃摊，，顺便买了点");
		topic.setTopicId(2);
		flag = topicDao.updateTopic(topic);
		if (flag > 0) {

			System.out.println("修改主题成功");
		} else {
			System.out.println("修改主题失败");
		}*/
		/*int flag=0;
		TopicDao topicDao = new TopicDaoImpl();
		flag=topicDao.findCountTopic(2);
		System.out.println("主题数有："+flag);*/
		int flag=0;
		TopicDao topicDao = new TopicDaoImpl();
		flag=topicDao.deleteTopic(4);
		if (flag > 0) {

			System.out.println("删除主题成功");
		} else {
			System.out.println("删除主题失败");
		}
	}

}
