package com.lxm.bbs.dao.entity;

public class Board {
	private int boardId=1; //版块ID
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

	private String boardTitle="java";  //版块标题
	private int parentId=1; //主版ID
	
	public void getBoardInfo(){
		System.out.println("=========版块信息===========");
		System.out.println("版块名称："+boardTitle);
	}
}
