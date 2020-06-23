package com.capgemini.set_answers;

public class Set209 {

	public static void dosum(Integer x, Integer y) {
		System.out.println("integer");
	}

	public static void dosum(double x, double y) {
		System.out.println("double");
	}

	public static void dosum(float x, float y) {
		System.out.println("float");
	}

	public static void main(String[] args) {
		dosum(10, 20);
		dosum(10.0, 20.0);

	}
}
