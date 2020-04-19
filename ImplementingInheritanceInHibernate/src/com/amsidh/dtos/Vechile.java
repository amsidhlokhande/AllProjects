/**
 * 
 */
package com.amsidh.dtos;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author amsidhlokhande
 * 
 */
@Entity
@DiscriminatorColumn(name="VECHILE_TYPE",discriminatorType=DiscriminatorType.STRING)
public class Vechile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer vechileId;
	private String vechileName;

	/**
	 * @return the vechileId
	 */
	public Integer getVechileId() {
		return vechileId;
	}

	/**
	 * @param vechileId
	 *            the vechileId to set
	 */
	public void setVechileId(Integer vechileId) {
		this.vechileId = vechileId;
	}

	/**
	 * @return the vechileName
	 */
	public String getVechileName() {
		return vechileName;
	}

	/**
	 * @param vechileName
	 *            the vechileName to set
	 */
	public void setVechileName(String vechileName) {
		this.vechileName = vechileName;
	}

}
