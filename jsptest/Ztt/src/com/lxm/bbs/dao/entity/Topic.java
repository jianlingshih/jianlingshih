package com.lxm.bbs.dao.entity;
public class Topic extends Tip {
	private int topicId=1;  //����ID
	private int boardId=1;  //���ID
	private int uId=1;
	public int getUId() {
		return uId;
	}
	public void setUId(int id) {
		uId = id;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public Topic(){
		super();
		//System.out.println("��������޲ι��췽��");
	}
	public Topic(String title,String content,String publishTime)
	{
		super(title,content,publishTime);
		System.out.println("��������вι��췽��");
	}
	public void getInfo(Tip t){
		System.out.println("=======�������Ϣ=========");
		System.out.println("���ӱ���:"+this.getTitle());
		System.out.println("��������"+this.getContent());
		System.out.println("����ʱ��"+this.getPublishTime());
	}
}
