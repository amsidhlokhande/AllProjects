/**
 * 
 */
package com.amsidh.mvc.dtos;

import java.io.Serializable;

/**
 * @author amsidhlokhande
 *
 */
public class Triangle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3460485709410342488L;

	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void draw()
	{
		System.out.println(this.type+" triangle drwan");
	}
}
