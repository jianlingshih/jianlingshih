package com.lxm.bbs.dao.entity;

public class Tip {
	private String title="我是新手，请大家指教";  //帖子标题
	private String content="我刚开始学java，请大家指教"; //帖子的内容
	private String publishTime="2009-07-14 10:14:00"; //帖子的发布时间
	private int uId=1;  //用户的ID
	private String modifyTime;  //修改时间
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	public Tip(){
		
		this.title="暂无主题信息";
		this.content="";
		this.publishTime="";
		this.modifyTime="2018-8-8 20:00:00.00 ";
		//System.out.println("我调用的是无参构造方法");
	}
	public Tip(String title,String content,String publishTime){
		this.title=title;
		this.content=content;
		this.publishTime=publishTime;
		System.out.println("我调用的是有参构造方法");
	}
	public void getInfo(){
        System.out.println("====帖子信息====");
        System.out.println("帖子标题：" + title);
        System.out.println("帖子内容：" + content);
        System.out.println("发表时间：" + publishTime + "\n");
    }
	public int getUId() {
		return uId;
	}
	public void setUId(int id) {
		uId = id;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public void getInfo(Tip t){
		t.getInfo(t);
	}
}
