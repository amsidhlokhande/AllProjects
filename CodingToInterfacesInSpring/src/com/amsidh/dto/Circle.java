package com.amsidh.dto;

import com.amsidh.intf.Shape;

public class Circle implements Shape {
	private Point centerPoint;

	/**
	 * @return the centerPoint
	 */
	public Point getCenterPoint() {
		return centerPoint;
	}

	/**
	 * @param centerPoint
	 *            the centerPoint to set
	 */
	public void setCenterPoint(Point centerPoint) {
		this.centerPoint = centerPoint;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amsidh.intf.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Drwaing Circle with the center point ("
				+ centerPoint.getX() + " , " + centerPoint.getY()+")");

	}

}
