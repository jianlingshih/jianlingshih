package com.lxm.bbs.dao.entity;

public class Reply extends Tip {
	private int replyId=1;  //回复ID
	private int topicId=1;  //主题ID
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
		System.out.println("=======回复的信息=========");
		System.out.println("帖子标题:"+this.getTitle());
		System.out.println("帖子内容"+this.getContent());
		System.out.println("发布时间"+this.getPublishTime());
	}
	
	
}
