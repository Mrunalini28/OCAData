package com.capemini.oracle.correctedques;

public class Subsubalfa extends Alfa {
	private Subsubalfa() {
		s += "subsub";
	}

	public static void main(String[] args) {
		new Subsubalfa();
		System.out.println(s);
	}
}
