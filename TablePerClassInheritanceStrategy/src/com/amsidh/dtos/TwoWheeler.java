/**
 * 
 */
package com.amsidh.dtos;

import javax.persistence.Entity;

/**
 * @author amsidhlokhande
 * 
 */
@Entity
public class TwoWheeler extends Vechile {
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
