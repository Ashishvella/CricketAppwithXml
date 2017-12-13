package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
	

	}

}
