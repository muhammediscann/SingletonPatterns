package com.example.singleton;

public class TestSingletonPattern {

	public static void main(String[] args) {
		Shape instance = Shape.getInstanceObject();
		instance.showMessage();
	}

}
