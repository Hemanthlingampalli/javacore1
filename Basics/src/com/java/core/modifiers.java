package com.java.core;

public class modifiers {
	protected void prem() {
		System.out.println("accessing protected method of this class");
	}
    private void hemanth() {
    	System.out.println("my private name");
    }
    public void naveen() {
    	System.out.println("hello public");
    }
     void manoj() {
    	System.out.println("default method");
    }
	public static void main(String[] args) {
		modifiers obj= new modifiers();
		obj.prem();
		obj.hemanth();
		obj.naveen();
		obj.manoj();	
	}
}
