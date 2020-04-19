package com.amsidh.core.domain;

public class Triangle {

	private Point a;
	private Point b;
	private Point c;
    
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}
	
	public void draw()
	{
		System.out.println("Triangle Drawn With Below Co-Ordinator:");
		System.out.println("A ("+a.getX()+","+a.getY()+")");
		System.out.println("B ("+b.getX()+","+b.getY()+")");
		System.out.println("C ("+c.getX()+","+c.getY()+")");
	}

}
