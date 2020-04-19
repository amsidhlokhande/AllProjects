/**
 * 
 */
package com.amsidh.mvc.dtos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author VIRU
 * 
 */
@Entity
@Table(name = "USERDETAILS")
public class UserDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2245700289831106815L;

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "DOB")
	private Date dateOfBirth;

	@Column(name = "ADDRESS")
	private Address address;

	/*
	 * As default this column name is vechile_vechileId.So if u want to change then add @JoinCoulmn annotation as like below
	 */
	@OneToOne
	@JoinColumn(name="VECHILE_ID")
	private Vechile vechile;

	/**
	 * 
	 */
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userName
	 * @param dateOfBirth
	 * @param address
	 * @param vechile
	 */
	public UserDetails(String userName, Date dateOfBirth,
			Address address, Vechile vechile) {
		super();
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.vechile = vechile;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
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
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the vechile
	 */
	public Vechile getVechile() {
		return vechile;
	}

	/**
	 * @param vechile
	 *            the vechile to set
	 */
	public void setVechile(Vechile vechile) {
		this.vechile = vechile;
	}

}
