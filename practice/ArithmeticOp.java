package com.anudip.practice;

public class ArithmeticOp {
	
	//int a=3;
	//int b=4;
	
	
	void add(int a,int b){
		
		//int a=2;
		//int b=3;
		System.out.println(a+b);
	}
	
	void sub(int a,int b) {
		//int a=3;
		//int b=4;
		System.out.println(a-b);
	}
	void mul(int a,int b) {
		//int a=3;
		//int b=4;
		System.out.println(a*b);
	}
	void div(int a, int b) {
		//int a=3;
		//int b=4;
		System.out.println(a/b);
	}
	void mod(int a, int b) {
		//int a=3;
		//int b=4;
		System.out.println(a%b);
	}




	public static void main(String[] args) {
		ArithmeticOp ap = new ArithmeticOp();
		
		ap.add(2, 3);
		ap.sub(4, 3);
		ap.mul(4, 3);
		ap.div(4, 2);
		ap.mod(1, 1);
		// ap.sub();
		// ap.mul();
		// ap.div();
		// ap.mod();
	}

}