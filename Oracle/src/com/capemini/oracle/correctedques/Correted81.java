package com.capemini.oracle.correctedques;

public class Correted81 {
	int x;
	int y;

	public void dostuff(int x, int y) {
		this.x = x;
		y = this.y;
	}

	public void display() {
		System.out.println(x + " " + y + " ");
	}

	public static void main(String[] args) {
		Correted81 crr = new Correted81();
		crr.x = 100;
		crr.y = 200;
		Correted81 crr1 = new Correted81();
		crr1.dostuff(crr.x, crr.y);
		crr.display();
		crr1.display();
	}
}
