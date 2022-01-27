package com.java.core;
	import java.util.Scanner;
	public class methods {
		public int add(int a,int b) {
			return a+b;
		}
		public int add(int a,int b,int c) {
			return a+b+c;
		}
		public float add(float a,float b) {
			return  a+b;
		}
		public float add(float a,float b,float c) {
			return a+b+c;
		}
		public double add(double a,double b) {
			return a+b;
		}
		public static void main(String[] args) {
			methods m=new methods();
			
			Scanner Sc=new Scanner(System.in);
			System.out.print("enter number");
			int x=Sc.nextInt();
			int y=Sc.nextInt();
			System.out.println("add 2 int"+m.add(x,y));
			System.out.println("add 3 int"+m.add(3,6,9));
			System.out.println("add 2 float"+m.add(5.6f, 6.2f));
			System.out.println("add 3 float"+m.add(12.0f,5.6f,3.2f));
			System.out.println("add 2 double"+m.add(4.5, 6.7));
		}
}
