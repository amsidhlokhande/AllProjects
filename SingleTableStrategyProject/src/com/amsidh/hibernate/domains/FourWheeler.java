package com.amsidh.hibernate.domains;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CAR")  // by default class name is the value of @DiscriminatorValue
public class FourWheeler extends Vehicle {
  
	private String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

		
}
