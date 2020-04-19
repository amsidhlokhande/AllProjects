package com.amsidh.hibernate.domains;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BIKE")  // by default class name is the value of @DiscriminatorValue
public class TwoWheeler extends Vehicle {

	private String steeringHandler;

	public String getSteeringHandler() {
		return steeringHandler;
	}

	public void setSteeringHandler(String steeringHandler) {
		this.steeringHandler = steeringHandler;
	}

}
