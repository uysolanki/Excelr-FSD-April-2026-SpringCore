package com.excelr.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excelr.model.Car;
import com.excelr.model.Engine;
import com.excelr.model.Gear;

public class DriverApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext iocContainer = new ClassPathXmlApplicationContext("resources/mybeansconfig.xml");
		System.out.println("Hi");
//		Engine eng1=(Engine)iocContainer.getBean("e1");
//		System.out.println(eng1);
//		
//		Engine eng2=(Engine)iocContainer.getBean("e2");
//		System.out.println(eng2);
//		
//		Gear gear1=iocContainer.getBean("g1", Gear.class);
//		System.out.println(gear1);
//		
//		Gear gear2=iocContainer.getBean("g2", Gear.class);
//		System.out.println(gear2);
		
		Car car1=iocContainer.getBean("c1", Car.class);
		System.out.println(car1);
		
		Car car2=iocContainer.getBean("c2", Car.class);
		System.out.println(car2);
		
		System.out.println(car1==car2);
	}

}

//Springboot is used to develop 1)Large, 2)Scalable , 3)Enterprise application
