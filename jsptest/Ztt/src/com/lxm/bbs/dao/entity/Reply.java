package com.lxm.bbs.dao.entity;

public class Reply extends Tip {
	private int replyId=1;  //�ظ�ID
	private int topicId=1;  //����ID
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public void getInfo(Tip t){
		System.out.println("=======�ظ�����Ϣ=========");
		System.out.println("���ӱ���:"+this.getTitle());
		System.out.println("��������"+this.getContent());
		System.out.println("����ʱ��"+this.getPublishTime());
	}
	
	
}
