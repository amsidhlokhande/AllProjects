package com.amsidh.dto;

import com.amsidh.intf.Shape;

public class Triangle implements Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	/**
	 * @return the pointA
	 */
	public Point getPointA() {
		return pointA;
	}

	/**
	 * @param pointA
	 *            the pointA to set
	 */
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	/**
	 * @return the pointB
	 */
	public Point getPointB() {
		return pointB;
	}

	/**
	 * @param pointB
	 *            the pointB to set
	 */
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	/**
	 * @return the pointC
	 */
	public Point getPointC() {
		return pointC;
	}

	/**
	 * @param pointC
	 *            the pointC to set
	 */
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amsidh.intf.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Drawing a Triangle with below Details");
		System.out.println("A( " + pointA.getX() + " , " + pointA.getY()+")");
		System.out.println("B( " + pointB.getX() + " , " + pointB.getY()+")");
		System.out.println("C( " + pointC.getX() + " , " + pointC.getY()+")");

	}

}
