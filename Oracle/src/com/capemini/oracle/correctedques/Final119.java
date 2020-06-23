package com.capemini.oracle.correctedques;

public class Final119 {
	public static void main(String[] args) {
		int wd = 0;
		String days[] = { "sun", "mon", "wed", "sat" };
		for (String s : days) {
			System.out.println(s);
			switch (s) {
			case "sat":
			case "sun":
				wd -= 1;
				break;
			case "mon":
				wd++;
			case "wed":
				wd += 2;
			}
		}
		System.out.println(wd);
	}
}
