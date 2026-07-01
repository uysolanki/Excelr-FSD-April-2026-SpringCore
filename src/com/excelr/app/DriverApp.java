package com.excelr.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excelr.model.Engine;

public class DriverApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext iocContainer = new ClassPathXmlApplicationContext("resources/mybeansconfig.xml");

		Engine eng1=(Engine)iocContainer.getBean("e1");
		System.out.println(eng1);
		
		Engine eng2=(Engine)iocContainer.getBean("e2");
		System.out.println(eng2);
	}

}
