package com.anudip.practice;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Write a Java program to get a number from the user and print whether it is positive or negative
		
//		int n= sc.nextInt();
//		
//		if(n > 0) {
//			System.out.println(n + " is a Positive Number");
//		}else if(n < 0) {
//			System.out.println(n + " is a Negative Number");
//		}else {
//			System.out.println(n + " is Zero");
//		}

		
		
		
//		Write a Java program that takes three numbers from the user and prints the greatest number.
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		System.out.print("Enter c : ");
		int c = sc.nextInt();
	
		if(a>=b && a>=c)  
			System.out.println(a+" is the largest Number");  
		else if (b>=a && b>=c)  
			System.out.println(b+" is the largest Number");  
		else  
			System.out.println(c+" is the largest number");  
	  
	sc.close();
	}
	
}
