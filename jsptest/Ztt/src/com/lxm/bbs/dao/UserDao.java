package com.lxm.bbs.dao;

import com.lxm.bbs.dao.entity.User;

public interface UserDao {
	public User findUser(String uName);  //�����û�
	public int addUser(User user);  //�����û�
	public int updateUser(User user);  //�޸��û�
	public User findUser(int uId);  //ͨ���û�ID�ҵ���Ӧ���û���Ϣ
}