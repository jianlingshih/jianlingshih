package com.lxm.bbs.dao.entity;

public class Tip {
	private String title="�������֣�����ָ��";  //���ӱ���
	private String content="�Ҹտ�ʼѧjava������ָ��"; //���ӵ�����
	private String publishTime="2009-07-14 10:14:00"; //���ӵķ���ʱ��
	private int uId=1;  //�û���ID
	private String modifyTime;  //�޸�ʱ��
	
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
		
		this.title="����������Ϣ";
		this.content="";
		this.publishTime="";
		this.modifyTime="2018-8-8 20:00:00.00 ";
		//System.out.println("�ҵ��õ����޲ι��췽��");
	}
	public Tip(String title,String content,String publishTime){
		this.title=title;
		this.content=content;
		this.publishTime=publishTime;
		System.out.println("�ҵ��õ����вι��췽��");
	}
	public void getInfo(){
        System.out.println("====������Ϣ====");
        System.out.println("���ӱ��⣺" + title);
        System.out.println("�������ݣ�" + content);
        System.out.println("����ʱ�䣺" + publishTime + "\n");
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
