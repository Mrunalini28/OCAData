package com.capgemini.oca;

public class Questionincrement {
	public static void main(String[] args) {
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		int d = (a < b) ? (a < c) ? a : (b < c) ? b : c:x;
		System.out.println(d);
	}
}
