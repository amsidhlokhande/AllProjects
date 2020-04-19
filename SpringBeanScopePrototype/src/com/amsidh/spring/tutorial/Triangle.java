package com.amsidh.spring.tutorial;


public class Triangle {

	public Triangle() {
		System.out
				.println("Prototype Bean scope will created a new bean for every get bean call.");
	}

	public void draw() {
		System.out.println("Triangle drawn!!!!");
	}
}
