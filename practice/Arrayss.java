package com.anudip.practice;
import java.util.*;

public class Arrayss {

	public static void main(String[] args) {
		
		// Ways to initialize 
		int[] a = new int[10];
		
		int[] b;
		b= new int[10];
		
		int[] c= {1,2,3,4};
		
		
		// Access elements
		System.out.println(c[2]);
		
		// print whole array
		for(int i=0 ; i< c.length ; i++) {
			System.out.print(c[i] + " ");
		}
		
		// Copy in new array
		int[] d = c;
		
		int[] e = new int[c.length];
		for(int i=0 ; i< c.length ; i++) {
			e[i]= c[i] ;
		}
		
		int[] m = Arrays.copyOf(c, c.length);
		c[2] = 33;
		System.out.println(m[2]);

	}
}
