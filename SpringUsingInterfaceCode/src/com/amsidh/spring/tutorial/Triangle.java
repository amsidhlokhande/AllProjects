package com.amsidh.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Triangle implements Shape{

	
	private Point pointA;
	@Autowired
	@Qualifier("pointBQualifier")
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	@Required
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	@Required
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	@Required
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("PointA( "+pointA.getX()+" , "+pointA.getY()+" )");
		System.out.println("PointB( "+pointB.getX()+" , "+pointB.getY()+" )");
		System.out.println("PointC( "+pointC.getX()+" , "+pointC.getY()+" )");
	}
}
