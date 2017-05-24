package com.lxm.bbs.dao.entity;
public class Topic extends Tip {
	private int topicId=1;  //主题ID
	private int boardId=1;  //版块ID
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
		//System.out.println("主题类的无参构造方法");
	}
	public Topic(String title,String content,String publishTime)
	{
		super(title,content,publishTime);
		System.out.println("主题类的有参构造方法");
	}
	public void getInfo(Tip t){
		System.out.println("=======主题的信息=========");
		System.out.println("帖子标题:"+this.getTitle());
		System.out.println("帖子内容"+this.getContent());
		System.out.println("发布时间"+this.getPublishTime());
	}
}
