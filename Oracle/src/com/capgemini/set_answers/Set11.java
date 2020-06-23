package com.capgemini.set_answers;

public class Set11 {
	int al;

	public static void doproduct(int a) {
		a = a * a;
	}

	public static void dostring(String s) {
		s.concat(" " + s);
	}

	public static void main(String[] args) {
		Set11 item = new Set11();
		item.al = 11;
		String sb = "Hello";
		Integer i = 10;
		doproduct(i);
		dostring(sb);
		doproduct(item.al);
		System.out.println(i + " " + sb + " " + item.al);
	}
}
