package com.amsidh.spring.tutorial;


public class Triangle {

	private Point pointA;

	
	
	
	public Point getPointA() {
		return pointA;
	}




	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}




	public void draw()
	{
		
			System.out.println("PointA ("+pointA.getX()+","+pointA.getY()+")");
	}
}
