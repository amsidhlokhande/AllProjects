package com.amsidh.messanger;


public class Message
{
	public static boolean flag=false;
	private static String  message; 
	public void init()
	{
		System.out.println(flag);
		System.out.println("init is called");
		this.message="Hello World";
		flag=true;
		System.out.println(flag);
	}
	public void display1()
	{
		System.out.println("message 1"+message);
		System.out.println(flag);
	}
	
	public void display2()
	{
		System.out.println("message 2"+message);
		System.out.println(flag);
	}
	
	public void display3()
	{
		System.out.println("message 3"+message);
		System.out.println(flag);
	}

}
