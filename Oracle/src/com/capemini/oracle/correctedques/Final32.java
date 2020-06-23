package com.capemini.oracle.correctedques;

public class Final32 {
	public static void main(String[] args) {
		int var = 200;
		System.out.println(docal(var));
		System.out.println(" " + var);
		Final32 fin = new Final32();
		fin.start();
		fin.init();
	}

	static int docal(int d) {
		d = d * 2;
		return d;
	}
	
	private void init () {
		System.out.println("init method");
	}
	private void start() {
		init();
		System.out.println("started method");
		
	}
}
