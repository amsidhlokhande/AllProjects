/**
 * 
 */
package com.amsidh.dtos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


/**
 * @author amsidhlokhande
 * 
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Vechile {

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
