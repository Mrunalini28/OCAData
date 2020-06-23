package com.capemini.oracle.correctedques;

public class Test134 {
	public static void main(String[] args) {
		Corrected134[] arr = new Corrected134[3];
		arr[1] = new Corrected134("Richard");
		arr[2] = new Corrected134("Donald");
		for (Corrected134 s : arr) {
			System.out.println("" + s.name);
		}

	}
}
