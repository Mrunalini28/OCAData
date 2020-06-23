package com.capgemini.set_answers;

public class Set20 {
	static double area;
	int b = 2, h = 3;

	public static void main(String[] args) {
		double p, h, b;
		if (area == 0) {
			b = 3;
			h = 4;
			p = 0.5;
			area = p * h * b;
		}
		System.out.println("area is " + area);
	}
}
