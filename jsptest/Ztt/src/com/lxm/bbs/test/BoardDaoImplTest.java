package com.lxm.bbs.test;

import java.util.List;
import java.util.Map;

import com.lxm.bbs.dao.BoardDao;
import com.lxm.bbs.dao.entity.Board;
import com.lxm.bbs.dao.impl.BoardDaoImpl;

public class BoardDaoImplTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	BoardDao boardDao=new BoardDaoImpl();
		Map mapBoard=boardDao.findBoard();
		List listBoard=(List)mapBoard.get("0");
		for (int i = 0; i < listBoard.size(); i++) {
			Board board=(Board)listBoard.get(i);
			System.out.println("==========="+"\n"+"Ö÷°æ¿é"+board.getBoardTitle());
			List listSunBoard=(List)mapBoard.get(board.getBoardId()+"");
			if (listSunBoard!=null) {
				for (int j = 0; j <listSunBoard.size(); j++) {
					Board sunBoard=(Board) listSunBoard.get(j);
					System.out.println("×Ó°æ¿é"+sunBoard.getBoardTitle());
				}
			}else{
				System.out.println("ÔÝÎÞ×Ó°æ¿é");
			}
			
		}*/
		BoardDao boardDao=new BoardDaoImpl();
		Board board=boardDao.findBoard(1);
		System.out.println("°æ¿éID£º"+board.getBoardId());
		System.out.println("°æ¿éÃû³Æ£º"+board.getBoardTitle());
		System.out.println("¸¸°æ¿éID£º"+board.getParentId());
		

	}
}
