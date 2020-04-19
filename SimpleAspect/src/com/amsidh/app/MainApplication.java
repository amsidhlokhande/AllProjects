package com.amsidh.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.messanger.Message;

public class MainApplication
{
  public static void main(String[] args)
{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Message message=(Message)context.getBean(Message.class);
	message.display1();
	message.display3();
	message.display2();
	
	
	
	
}
}
