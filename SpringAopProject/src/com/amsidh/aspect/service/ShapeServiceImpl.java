package com.amsidh.aspect.service;

import com.amsidh.aspect.domain.Circle;
import com.amsidh.aspect.domain.Triangle;
import com.amsidh.pointcuts.Loggable;

public class ShapeServiceImpl {

	private Triangle triangle;
	private Circle circle;
 
	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	@Loggable 
	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

}
