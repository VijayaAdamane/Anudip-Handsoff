package com.anudip.practice;

public class Mock {
	
	void add(int a, int b) {
		System.out.println(a+b);
//		return a+b;
	}
	
	void add(float a, float b) {
		System.out.println(a+b);
//		return a+b;
	}
	

	 static void main(String[] args) {
		
		int[] a = {2,5};
		
		
		
		
		Mock p = new Mock();
		p.add(10,20);
		p.add(20.2, 10.3);
		
//		System.out.println(	p.add(10,20));
//		System.out.println(	p.add(10.2,22.2));
		
	
}
}
