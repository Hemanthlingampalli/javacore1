package com.java.core;

public class typeCasting {
public static void main(String[] args) {
		
		byte a= 10;
		
		System.out.println("Byte "+a);
		
		short b= a;
		System.out.println("Converted Byte to short "+b);
		
		int c=b;
		System.out.println("Converted Short to int "+c);
		
		int d=a;
		System.out.println("Converted Byte to int "+d);
		
		float e=d;
		System.out.println("Converted Int to float "+e);
		
		double f=e;
		System.out.println("converted Float to double "+f);
		
		double g=d;
		System.out.println("Converted int to double "+g);
	}
}
