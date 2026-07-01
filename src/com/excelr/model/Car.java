package com.excelr.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	private String carMfg;
	private String carModel;
	private String carColor;
	private double carPrice;
	
	@Autowired
	@Qualifier("e1")
	private Engine engine;		//dependency
	
	@Autowired
	@Qualifier("g1")
	private Gear gear;
	
	public Car() {}
								//Injecting Dependency using Constructor - CDI
	public Car(String carMfg, String carModel, String carColor, double carPrice, Engine engine, Gear gear) {
		this.carMfg = carMfg;
		this.carModel = carModel;
		this.carColor = carColor;
		this.carPrice = carPrice;
		this.engine = engine;
		this.gear = gear;
		
		System.out.println("All Args Constructor of the Car class invoked");
	}
	
	public Car(String carMfg, String carModel, String carColor, double carPrice) {
		this.carMfg = carMfg;
		this.carModel = carModel;
		this.carColor = carColor;
		this.carPrice = carPrice;
	}

	
	public String getCarMfg() {
		return carMfg;
	}
	public void setCarMfg(String carMfg) {
		this.carMfg = carMfg;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Gear getGear() {
		return gear;
	}
	public void setGear(Gear gear) {
		this.gear = gear;
	}
	@Override
	public String toString() {
		return "Car [carMfg=" + carMfg + ", carModel=" + carModel + ", carColor=" + carColor + ", carPrice=" + carPrice
				+ ", engine=" + engine + ", gear=" + gear + "]";
	}
	
	
	
}
