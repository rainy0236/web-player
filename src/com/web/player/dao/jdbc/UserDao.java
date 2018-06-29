/*
 * Copyright (c) 2017 Strong Group - 版权所有
 * 
 * This software is the confidential and proprietary information of
 * Strong Group. You shall not disclose such confidential information 
 * and shall use it only in accordance with the terms of the license 
 * agreement you entered into with www.cnstrong.cn.
 */
package com.web.player.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.web.player.model.User;

/**
 *
 * 描述:
 *
 * @author  yuanyi
 * @created 2017年4月1日 上午11:26:32
 * @since   v1.0.0
 */
public class UserDao {

	String url = "jdbc:mysql://localhost:3306/first?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true";
	String userName = "yuanyi";
	String password = "123456";
	
	public boolean insert(User user) throws ClassNotFoundException, SQLException {
		//加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, userName, password);
		PreparedStatement ps = conn.prepareStatement("INSERT INTO user VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, 2, 0, "+user.getCreatedBy()+", NOW(), "+user.getModifiedBy()+", NOW())");
		ps.setString(1, user.getUserName());
		ps.setString(2, user.getLoginName());
		ps.setString(3, user.getPassword());
		ps.setInt(4, user.getSex());
		ps.setString(5, user.getEmail());
		ps.setString(6, user.getPhone());
		ps.setString(7, user.getPhoto());
		
		
		return ps.executeUpdate() > 0;
	}
}
