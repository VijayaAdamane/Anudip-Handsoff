package com.anudip.practice;

public class Operators {

    public static void main(String[] args) {
    	
    	
// Logical Operator and Relational Operator
        int a = 20;
        int b = 4 ;
        boolean c = a>b;
         System.out.println(c);
         System.out.println(a<b);
         System.out.println(a<=b);
         System.out.println(a>=b);
         System.out.println(a!=b);

// && (logical and) ||(logical or) !(logical not)
        System.out.println(b>3 && b<10);
        System.out.println(b>10 || b<10);  
    
        

// increment operator (++)  decrement operator (--)
    	     int x=5;
    		System.out.println(x); // output 5;
    		x++; // increment operator will increment the value by 1
    		System.out.println(x);//output 6
    		System.out.println(x++); //output 6
    		System.out.println(x);//output 7
    		--x;
    		System.out.println(x);//output 6
    		System.out.println(--x);//output 5

    		

// & (bitwise and)  
    		
    		int m = 60;
    		int n = 13;
    		
    		System.out.println(m&n);
    		System.out.println(m|n);
    		System.out.println(m^n);
    		System.out.println(m<<2);
    		System.out.println(m>>2);
    		
//    		128 64 32 16  8 4 2 1
    		
//    		 0   0  1  1  1 1 0 0  
//    	&	
//    		 0   0  0  0  1 1 0 1
    		
//    	=	 0   0  0  0  1 1 0 0
//    		12		
    		
    		
// (|) bitwise OR 
    		
//   		 0   0  1  1  1 1 0 0  
//   	|	
//   		 0   0  0  0  1 1 0 1
    		
//    		 0   0  1  1  1 1 0 1
//    		61
    		
    		
//  (^)		
//    		 0   0  1  1  1 1 0 0  
//    		^
//    		 0   0  0  0  1 1 0 1

//    		 0   0  1  1  0 0 0 1
//    		49
    		
// << (left shift)
    		
//    		m<<2   
//    		0  0  1  1  1 1 0 0 
//    		1  1  1  1  0 0 0 0
//    		240
    		
// >> (right shift)
//    		m>>2
//        	0  0  1  1  1 1 0 0 
//    		0  0  0  0  1 1 1 1
//    		15
    		
    		
    		// Ternary operator 
    		System.out.println((m < n) ? m : n );
		
    }
}