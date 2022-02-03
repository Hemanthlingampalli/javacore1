package com.java2.ExceptionHandling;

public class Handling4 {

	static void waitFor()
	{
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		waitFor();
	}
}
