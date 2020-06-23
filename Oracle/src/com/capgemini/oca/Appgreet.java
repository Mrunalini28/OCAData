package com.capgemini.oca;

public class Appgreet {
	String greet = "welcome";

	public Appgreet() {
		String greet = "hello";
	}

	public void setGreet() {
		String greet = "goodDay";
	}

	public static void main(String[] args) {
		Appgreet appgreet = new Appgreet();
		String greet = "Good Luck";
		System.out.println(appgreet.greet);
	}
}
