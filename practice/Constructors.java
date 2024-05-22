package com.anudip.practice;

public class Constructors {
	{ // instance block
		System.out.println("Hii instance");
		
	}
	
	static { // static
		
		System.out.println("Hello static");
	}
	
	public Constructors() {
		System.out.println("I am Constructor");
	}
	public static void main(String[] args) {
		
		Constructors cd = new Constructors();
	}
}
