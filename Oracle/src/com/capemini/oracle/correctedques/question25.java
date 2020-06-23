package com.capemini.oracle.correctedques;

public class question25 {
	String name;
	boolean contact;
	double salary;

	question25() {
		this.name = "joe";
		this.contact = true;
		this.salary = 100;
	}

	public String toString() {
		return name + ":" + contact + ":" + salary;
	}

	public static void main(String[] args) {
		question25 q = new question25();
		System.out.println(q);

	}
}
