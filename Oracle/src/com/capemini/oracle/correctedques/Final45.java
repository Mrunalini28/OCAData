package com.capemini.oracle.correctedques;

public class Final45 {
	int al;

	public static void doproduct(int a) {
		a = a * a;
	}

	public static void dostring(StringBuilder s) {
		s.append(" " + s);
	}

	public static void main(String[] args) {
		Final45 obj = new Final45();
		obj.al = 11;
		StringBuilder sb = new StringBuilder("Hello");
		Integer i = 10;
		doproduct(i);
		dostring(sb);
		doproduct(obj.al);
		System.out.println(i + " " + sb + " " + obj.al);
	}
}
