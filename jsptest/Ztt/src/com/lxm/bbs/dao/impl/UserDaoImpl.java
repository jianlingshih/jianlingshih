package com.lxm.bbs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.lxm.bbs.dao.BaseDao;
import com.lxm.bbs.dao.UserDao;
import com.lxm.bbs.dao.entity.User;

public class UserDaoImpl extends BaseDao implements UserDao{

	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
//	private User [] users=new User[3];
	public int addUser(User user) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < 3; i++) {
//			if (users[i]==null) {
//				users[i]=user;
//				users[i].setUId(i);
//				return 1;
//			}
//		}
//		return 0;
		String time=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
		String sql="insert into user(uName,uPass,head,regTime,gender) values(?,?,?,?,?)";
		String[] getValue={user.getUName(),user.getUPass(),user.getHead(),time,user.getGender()+""};
		//如果定义的String类型数组要存int类型的数据时，只要在后面加上一个+号和""号
		
		return this.executeSQL(sql, getValue);
	}

	public User findUser(String name) { //通过用户名查找对应的用户信息

		User user=null;
		String sql="select * from user where uName=?";
		try {
			conn=this.getConn();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			while (rs.next()) {
				user=new User();
				user.setUId(rs.getInt("uId"));
				user.setUName(rs.getString("uName"));
				user.setUPass(rs.getString("uPass"));
				user.setHead(rs.getString("head"));
				user.setRegTime(rs.getString("regTime"));
				user.setGender(rs.getInt("gender"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("findUser方法异常通过用户名查找");
			e.printStackTrace();
		}finally{
			this.closeAll(conn, pstmt, rs);
		}
		return user;
	}

	public int updateUser(User user) {
		// TODO Auto-generated method stub
		String sql="update user set uPass=? where uName=?";
		String[] getValue={user.getUPass(),user.getUName()};
		return this.executeSQL(sql, getValue);
	}

	@Override
	public User findUser(int id) {
		// TODO Auto-generated method stub
		User user=null;
		String sql="select * from user where uId=?";
		try {
			conn=this.getConn();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			while (rs.next()) {
				user=new User();
				user.setUId(rs.getInt("uId"));
				user.setUName(rs.getString("uName"));
				user.setUPass(rs.getString("uPass"));
				user.setHead(rs.getString("head"));
				user.setRegTime(rs.getString("regTime"));
				user.setGender(rs.getInt("gender"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("findUser方法异常通过用户id查找");
			e.printStackTrace();
		}finally{
			this.closeAll(conn, pstmt, rs);
		}
		return user;
	}

	

}