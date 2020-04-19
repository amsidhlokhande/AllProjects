package com.amsidh.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle implements Shape {

	@Autowired
	private Point centerPoint;

	public Point getCenterPoint() {
		return centerPoint;
	}
	

	public void setCenterPoint(Point centerPoint) {
		this.centerPoint = centerPoint;
	}


	@Override
	public void draw() {
		System.out.println("Circle center point (" + centerPoint.getX() + " , "
				+ centerPoint.getY() + " )");

	}

}
