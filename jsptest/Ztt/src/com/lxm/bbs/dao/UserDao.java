package com.lxm.bbs.dao;

import com.lxm.bbs.dao.entity.User;

public interface UserDao {
	public User findUser(String uName);  //查找用户
	public int addUser(User user);  //增加用户
	public int updateUser(User user);  //修改用户
	public User findUser(int uId);  //通过用户ID找到对应的用户信息
}