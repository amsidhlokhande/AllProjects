package com.amsidh.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	@Autowired
	private Point center;

	
	


	public Point getCenter() {
		return center;
	}





	public void setCenter(Point center) {
		this.center = center;
	}





	@Override
	public void draw() {
		System.out.println("Circle center point(" + center.getX() + " , " + center.getY() + ")");
	}

}
