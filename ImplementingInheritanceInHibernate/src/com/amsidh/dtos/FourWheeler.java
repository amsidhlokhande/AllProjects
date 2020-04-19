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
@DiscriminatorValue("FOUR_WHEELER")
public class FourWheeler extends Vechile implements Serializable {

	private String steringWheel;

	/**
	 * @return the steringWheel
	 */
	public String getSteringWheel() {
		return steringWheel;
	}

	/**
	 * @param steringWheel
	 *            the steringWheel to set
	 */
	public void setSteringWheel(String steringWheel) {
		this.steringWheel = steringWheel;
	}

}
