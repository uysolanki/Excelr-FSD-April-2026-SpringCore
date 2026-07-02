package com.excelr.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excelr.config.MyBeansConExcelR;
import com.excelr.model.Car;
import com.excelr.model.Gear;
import com.excelr.model.Student;

public class DriverAppForJaveBasedBeans {

	public static void main(String[] args) {
		
		ApplicationContext iocContainer = new AnnotationConfigApplicationContext(MyBeansConExcelR.class);
		System.out.println("Hi");
//		Engine eng1=(Engine)iocContainer.getBean("getEngineUsingCDI");
//		System.out.println(eng1);
//		
//		Engine eng2=(Engine)iocContainer.getBean("getEngineUsingSDI");
//		System.out.println(eng2);
		
		Gear gear1=(Gear)iocContainer.getBean("g1");
		System.out.println(gear1);
		
		Gear gear2=(Gear)iocContainer.getBean("g2");
		System.out.println(gear2);
		
		Car car1=(Car)iocContainer.getBean("c1");
		System.out.println(car1);
		
		Student student1=(Student)iocContainer.getBean(Student.class);
		System.out.println(student1);

	}

}

//Springboot is used to develop 1)Large, 2)Scalable , 3)Enterprise application
