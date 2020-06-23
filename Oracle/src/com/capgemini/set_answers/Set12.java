package com.capgemini.set_answers;

public class Set12 {
	int x;
	int y;

	public void dostuff(int x, int y) {
		x = x;
		y = this.y;
	}

	public void display() {
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		Set12 obj = new Set12();
		obj.x = 100;
		obj.y = 200;
		Set12 obj2 = new Set12();
		obj2.dostuff(obj.x, obj.y);
		obj.display();
		obj2.display();
	}
}
