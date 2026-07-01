package com.excelr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.excelr.model.Car;
import com.excelr.model.Engine;
import com.excelr.model.Gear;

@Configuration   //the class which contains config info and not business logic
public class MyBeansConExcelR 
{
	@Bean(name="e1")
	public Engine getEngineUsingCDI()
	{
		Engine eng1=new Engine(2999, 29.0, "Ferrari", "Hybrid");
		return eng1;
	}
	
	@Bean(name="e2")
	public Engine getEngineUsingSDI()
	{
		Engine eng1=new Engine();
		eng1.setEngineCC(3000);
		eng1.setEngineLiter(25);
		eng1.setEngineMfg("BMW");
		eng1.setEngineType("Electric");
		return eng1;
	}
	
	@Bean(name="g1")
	public Gear getGearUsingCDI()
	{
		Gear gear1=new Gear(6, "Honda", "Manual");
		return gear1;
	}
	
	@Bean(name="g2")
	public Gear getGearUsingSDI()
	{
		Gear gear1=new Gear();
		gear1.setGearLever(10);
		gear1.setGearMfg("Volvo");
		gear1.setGearType("Automatic");
		return gear1;
	}
	
	@Bean(name="c1")
	public Car getCarUsingSDI()
	{
		Car car1=new Car();
		car1.setCarColor("Blue");
		car1.setCarMfg("Hyundai");
		car1.setCarModel("i10");
		car1.setCarPrice(200.0);
		return car1;
	}
	
}
