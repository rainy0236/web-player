/*
 * Copyright (c) 2017 Strong Group - 版权所有
 * 
 * This software is the confidential and proprietary information of
 * Strong Group. You shall not disclose such confidential information 
 * and shall use it only in accordance with the terms of the license 
 * agreement you entered into with www.cnstrong.cn.
 */
package com.web.player.action.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.player.model.User;
import com.web.player.service.user.UserService;
import com.web.player.util.playerUtils;

/**
 *
 * 描述:
 *
 * @author  yuanyi
 * @created 2017年3月30日 下午2:34:45
 * @since   v1.0.0
 */
public class RegisterAction extends HttpServlet {

	/**
	 * Description: 
	 */
	private static final long serialVersionUID = 2309050342705374691L;

	/* 
	(non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	
	/* 
	(non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = req.getParameter("userName");
		String loginName = req.getParameter("loginName");
		String password = req.getParameter("password");
		String sexStr = req.getParameter("sex");
		Integer sex = Integer.parseInt(sexStr == null ? "0" : sexStr);
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String photoUrl = req.getParameter("photoUrl");
		
		User user = new User();
		user.setUserName(userName);
		user.setLoginName(loginName);
		user.setPassword(password);
		user.setSex(sex);
		user.setEmail(email);
		user.setPhone(phone);
		user.setPhoto(photoUrl);
		
		UserService userService = new UserService();
		boolean isSuccess = userService.insert(user);
		/*boolean isSuccess = true;
		try {
			isSuccess = userDao.insert(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		if(isSuccess) {
			req.setAttribute("isSuccess", isSuccess?"true":"false");
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher(playerUtils.getContextPath(req)+"user/login.jsp");
		dispatcher.forward(req, resp);
//		resp.sendRedirect(path+"/WEB-INF/resources/pages/webPlayer.jsp");
	}
}
