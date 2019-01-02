package com.example.singleton;

public class Shape {
	
	private static Shape object = new Shape();
	
	private Shape() {}
	
	public static Shape getInstanceObject() {
		return object;
	}
	
	public void showMessage() {
		System.out.println("Hello-World");
	}
}
