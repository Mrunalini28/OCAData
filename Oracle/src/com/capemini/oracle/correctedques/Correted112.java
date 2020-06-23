package com.capemini.oracle.correctedques;

public class Correted112 {
	public static void main(String[] args) {
		int data[] = { 2010, 2013, 2014 };
		int key = 2014;
		int count = 0;
		for (int e : data) {
			if (e != key) {
				//continue:   error to colon
				count++;  //......unreachable code error

			}
		}
		System.out.println(count + "found");
	}
}
