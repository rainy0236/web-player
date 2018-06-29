/*
 * Copyright (c) 2017 Strong Group - 版权所有
 * 
 * This software is the confidential and proprietary information of
 * Strong Group. You shall not disclose such confidential information 
 * and shall use it only in accordance with the terms of the license 
 * agreement you entered into with www.cnstrong.cn.
 */
package com.web.player.util;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * 描述:
 *
 * @author  yuanyi
 * @created 2017年3月31日 下午5:24:16
 * @since   v1.0.0
 */
public class playerUtils {

	public static String getContextPath(HttpServletRequest request) {
		return request.getContextPath() + "/WEB-INF/resources/pages/";
	}
}
