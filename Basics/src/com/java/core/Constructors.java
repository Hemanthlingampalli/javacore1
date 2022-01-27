package com.java.core;

public class Constructors {
	int id;
	String name;
public Constructors() {
	id=83;
	name="hemanth";
}
public Constructors(int id,String name) {
	this.id=id;
	this.name=name;
}
public static void main(String[] args) {
	Constructors obj=new Constructors();
	System.out.println("User 1");
	System.out.println("Id: "+obj.id);
	System.out.println("Name: "+obj.name);
	
	Constructors obj2=new Constructors(63,"ramu");
	System.out.println("User 2");
	System.out.println("id: "+obj2.id);
	System.out.println("Name: "+obj2.name);
}

}
