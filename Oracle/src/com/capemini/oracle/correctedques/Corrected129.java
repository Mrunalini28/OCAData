package com.capemini.oracle.correctedques;

public class Corrected129 {
	int x, y;

	public Corrected129(int x, int y) {
		initialise(x, y);
	}

	public void initialise(int x, int y) {
		this.x = x * x;
		this.y = y * y;
	}

	public static void main(String[] args) {
		int x = 3, y = 5;
		Corrected129 obj = new Corrected129(x, y);
		System.out.println(x + " " + y);
		System.out.println(obj.x + " " + obj.y);
	}
}
