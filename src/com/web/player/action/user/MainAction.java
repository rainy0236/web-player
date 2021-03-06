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

import com.web.player.util.playerUtils;

/**
 *
 * 描述:
 *
 * @author  yuanyi
 * @created 2017年3月31日 下午5:08:06
 * @since   v1.0.0
 */
public class MainAction extends HttpServlet {

	/**
	 * Description: 
	 */
	private static final long serialVersionUID = -5754758524628694180L;

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
		RequestDispatcher dispatcher = req.getRequestDispatcher(playerUtils.getContextPath(req) + "user/register.jsp");
		dispatcher.forward(req, resp);
	}
}
