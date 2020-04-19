/**
 * 
 */
package com.amsidh.mvc.dtos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author VIRU
 * 
 */
@Entity(name = "UserDetails")
@Table(name = "USER_DETAILS")
public class UserDetails {

	@EmbeddedId
	private UserId userId;
	@Column(name = "EMAIL_ID")
	private String emailId;
	
	/**
	 * 
	 */
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userId
	 * @param userName
	 * @param emailId
	 */
	public UserDetails(UserId userId, String emailId) {
		super();
		this.userId = userId;
		this.emailId = emailId;
	}

	/**
	 * @return the userId
	 */
	public UserId getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(UserId userId) {
		this.userId = userId;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
}
