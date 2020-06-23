package com.capgemini.oca;

public class App {
	int foo;
	static int bar;

	static void process() {
		// foo += 10;
		bar += 10;
	}

	public static void main(String[] args) {
		App app1 = new App();
		app1.process();
		System.out.println(app1.bar);
		App app2 = new App();
		app2.process();
		System.out.println(app2.foo);
	}
}
