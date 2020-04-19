package com.amsidh.hibernate.domains;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name="VEHICLE_DTL")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) //this is default strategy so no need to mention
@DiscriminatorColumn(name="VEHICLE_TYPE",discriminatorType=DiscriminatorType.STRING) // default column name is dtype
@DiscriminatorValue("VECHILE")  // by default class name is the value of @DiscriminatorValue
public class Vehicle {

	@GeneratedValue
	@Id
	@Column(name = "VEHICLE_ID")
	private Integer vehicleId;
	@Column(name = "VEHICLE_NAME")
	private String vehicleName;

	
	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
}
