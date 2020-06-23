package com.capemini.oracle.correctedques;

public class Corrected16 {
	int x, y;

	public Corrected16(int x, int y) {
		//System.out.println(this.x);......prints 0
		initialised(x, y);
	}

	public void initialised(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		int x = 3, y = 5;
		Corrected16 crr = new Corrected16(x, y);
		System.out.println(x + " " + y);
	}
}
