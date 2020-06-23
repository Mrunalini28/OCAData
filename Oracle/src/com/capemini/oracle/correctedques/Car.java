package com.capemini.oracle.correctedques;

public class Car extends Vehicle {
	String trans;
	
	public Car(String type, int maxspeed,String trans) {
		super(type, maxspeed);
		//this(trans);


     // Car(String trans){
		this.trans=trans;
	}
}
