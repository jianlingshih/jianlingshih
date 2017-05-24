package com.lxm.bbs.test;

import com.lxm.bbs.dao.UserDao;
import com.lxm.bbs.dao.entity.User;
import com.lxm.bbs.dao.impl.UserDaoImpl;

public class UserDaoImplTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		UserDao userDao=new UserDaoImpl();
		User user=new User();
		user=userDao.findUser(5);
		System.out.println("用户名:"+user.getUName());
		System.out.println("注册时间"+user.getRegTime());
		
		//user=userDao.findUser(2);
		//System.out.println("用户名："+user.getUName());
		//System.out.println("用户密码："+user.getUPass());
		//System.out.println("注册时间："+user.getRegTime());
		/*user.setUName("abc");
		user.setUPass("123");
		
		user.setHead("6.gif");
		user.setGender(2);
		flag=userDao.addUser(user);
		if(flag>0){System.out.println("增加用户成功");}else
		{
			System.out.println("增加用户失败");
			
		}*/
		/*user.setUName("abc");
		user.setUPass("456789");
		flag=userDao.updateUser(user);
		if (flag>0) {
			System.out.println("修改成功");
		} else {
			System.out.println("用户名不存在，修改失败");
		}*/
	}

}

