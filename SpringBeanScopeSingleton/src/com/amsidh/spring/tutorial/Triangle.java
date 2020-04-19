package com.amsidh.spring.tutorial;


public class Triangle {

	public Triangle() {
		System.out
				.println("Singleton Bean scope is default scope.In this Only one instance is present in single context and that is used for every get bean");
	}

	public void draw() {
		System.out.println("Triangle drawn!!!!");
	}
}
