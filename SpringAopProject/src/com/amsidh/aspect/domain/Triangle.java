package com.amsidh.aspect.domain;

import com.amsidh.pointcuts.Loggable;

public class Triangle {

	private String name;
	@Loggable
	public String getName() {
		return name;
	}
	@Loggable
	public void setName(String name) {
		this.name = name;
		
		
	}
    
}
