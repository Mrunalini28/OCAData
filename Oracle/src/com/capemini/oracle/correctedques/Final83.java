package com.capemini.oracle.correctedques;

import java.util.ArrayList;

public class Final83 {
	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		String[] myarray;
		try {
			while (true) {
				mylist.add("my String");
			}
		} catch (RuntimeException re) {
			System.out.println("runtime");
		} catch (Exception e) {
			System.out.println("exception");
		}
		System.out.println("ready to use");
	}
}
