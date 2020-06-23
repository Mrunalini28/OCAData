package com.capemini.oracle.correctedques;

public class Testabc {
public static void main(String[] args) {
		A b1 = new A();
		A b2 = new C();
		b1 = (A) b2;
		A b3 = (B) b2;
		// A b3 =(B) b2; compilation error
		b1.test();
		b3.test();
	}
}
