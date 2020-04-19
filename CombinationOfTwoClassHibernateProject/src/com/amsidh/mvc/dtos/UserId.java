/**
 * 
 */
package com.amsidh.mvc.dtos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

/**
 * @author VIRU
 * 
 */
public class UserId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -554414792040896573L;
	
	@Column(name="USERID")
	private Integer userId;

	@Column(name = "USERNAME")
	private String userName;
	
	/**
	 * 
	 */
	public UserId() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userId
	 * @param userName
	 */
	public UserId(Integer userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
   
}
