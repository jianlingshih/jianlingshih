package com.lxm.bbs.dao.entity;

public class Board {
	private int boardId=1; //���ID
	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	private String boardTitle="java";  //������
	private int parentId=1; //����ID
	
	public void getBoardInfo(){
		System.out.println("=========�����Ϣ===========");
		System.out.println("������ƣ�"+boardTitle);
	}
}
