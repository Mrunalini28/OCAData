package com.capemini.oracle.correctedques;

public class Corrected33 {
	int ns;
	static int s;

	Corrected33(int ns) {
		if (s < ns) {
			s = ns;
			this.ns = ns;
		}
	}
	void doprint() {
		System.out.println("ns =" +ns+ "s = "+s);
	}
}
