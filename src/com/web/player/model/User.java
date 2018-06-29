/*
 * Copyright (c) 2017 Strong Group - 版权所有
 * 
 * This software is the confidential and proprietary information of
 * Strong Group. You shall not disclose such confidential information 
 * and shall use it only in accordance with the terms of the license 
 * agreement you entered into with www.cnstrong.cn.
 */
package com.web.player.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * 描述:
 *
 * @author  yuanyi
 * @created 2017年4月5日 下午2:34:01
 * @since   v1.0.0
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1952971558804020667L;
	/**
	 * Description: 主键
	 */
	private Long userId;
	/**
	 * Description: 用户名
	 */
	private String userName;
	/**
	 * Description: 账号
	 */
	private String loginName;
	/**
	 * Description: 密码
	 */
	private String password;
	/**
	 * Description: 性别:0-女 1-男
	 */
	private Integer sex;
	/**
	 * Description: 邮箱
	 */
	private String email;
	/**
	 * Description: 手机
	 */
	private String phone;
	/**
	 * Description: 头像
	 */
	private String photo;
	/**
	 * Description: 0-正常 1-冻结 2-邮箱为验证
	 */
	private Integer status;
	/**
	 * Description: 删除标志
	 */
	private Boolean isDeleted;
	/**
	 * Description: 创建人
	 */
	private Long createdBy;
	/**
	 * Description: 创建时间
	 */
	private Timestamp createdOn;
	/**
	 * Description: 修改人
	 */
	private Long modifiedBy;
	/**
	 * Description: 修改时间
	 */
	private Timestamp modifiedOn;
	
	/**
	 * setter and getter method
	 */
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
	public Long getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Timestamp getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
}
