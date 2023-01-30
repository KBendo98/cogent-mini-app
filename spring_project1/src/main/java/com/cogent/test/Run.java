package com.cogent.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cogent.controller.MyController;

public class Run {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyController controller = context.getBean(MyController.class);
		System.out.println(controller.welcome());
		System.out.println(controller.show().toString());
	}

}
