package com.java1.synchronization;

public class User extends Thread {

	String name;
	String msg;
	String sender;
	
	public User(String name,String msg,String sender)
	{
		this.name=name;
		this.msg=msg;
		this.sender=sender;
	}
	
	public void run()
	{
		System.out.println(name +" wants to send a message "+msg);
		
		synchronized(sender)
		{
			sender.sender(msg);
		}
	}
} 
