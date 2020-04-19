/**
 * 
 */
package com.amsidh.dtos;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author amsidhlokhande
 * 
 */
@Entity
@DiscriminatorValue("TWO_WHEELER")
public class TwoWheeler extends Vechile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String steringHandler;

	/**
	 * @return the steringHandler
	 */
	public String getSteringHandler() {
		return steringHandler;
	}

	/**
	 * @param steringHandler
	 *            the steringHandler to set
	 */
	public void setSteringHandler(String steringHandler) {
		this.steringHandler = steringHandler;
	}

}
