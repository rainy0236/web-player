/*
 * Copyright (c) 2017 Strong Group - 版权所有
 * 
 * This software is the confidential and proprietary information of
 * Strong Group. You shall not disclose such confidential information 
 * and shall use it only in accordance with the terms of the license 
 * agreement you entered into with www.cnstrong.cn.
 */
package com.web.player.dao.mybatis;

import com.web.player.model.User;

/**
 *
 * 描述:
 *
 * @author  yuanyi
 * @created 2017年4月1日 上午11:26:32
 * @since   v1.0.0
 */
public interface UserDao {
	
	public int insert(User user);
}
