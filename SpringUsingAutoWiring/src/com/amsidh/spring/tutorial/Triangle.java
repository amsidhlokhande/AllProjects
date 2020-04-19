package com.amsidh.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Triangle {

	@Autowired
	//@Qualifier("PointA")
	private Point pointA;

	@Autowired
	//@Qualifier("PointB")
	private Point pointB;
	
	@Autowired
	//@Qualifier("PointC")
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public Point getPointB() {
		return pointB;
	}
	
	public Point getPointC() {
		return pointC;
	}

	public void draw()
	{
		
			System.out.println("PointA ("+pointA.getX()+","+pointA.getY()+")");
			System.out.println("PointB ("+pointB.getX()+","+pointB.getY()+")");
			System.out.println("PointC ("+pointC.getX()+","+pointC.getY()+")");
		
	}
}
