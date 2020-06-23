package com.capemini.oracle.correctedques;

public class TestBook1402 implements Book1402 {
	public static void main(String[] args) {
		new TestBook1402().go();
	}

	void go() {
		System.out.println(hop());
		// System.out.println(getctof(100));
		System.out.println(Book1402.getctof(100));
		TestBook1402 abc=new TestBook1402();
		//System.out.println(abc.getctof(100));
		
	}
}
