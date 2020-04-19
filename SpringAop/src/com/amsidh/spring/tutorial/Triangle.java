package com.amsidh.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

	@Autowired
	private Point pointA;
	@Autowired
	private Point pointB;
	@Autowired
	private Point pointC;

	
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	@Override
	public void draw() {
		System.out.println("Triangle drawn with fellowing points");
		System.out.println("PointA(" + pointA.getX() + "," + pointA.getY()
				+ ")");
		System.out.println("PointB(" + pointB.getX() + "," + pointB.getY()
				+ ")");
		System.out.println("PointC(" + pointC.getX() + "," + pointC.getY()
				+ ")");
	}

}
