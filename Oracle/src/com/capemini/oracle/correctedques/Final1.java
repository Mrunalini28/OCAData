package com.capemini.oracle.correctedques;

public class Final1 {
	private char var;

	public static void main(String[] args) {
		char var1 = 'a';
		char var2 = var1;
		var2 = 'e';
		Final1 fin1 = new Final1();
		Final1 fin2 = fin1;
		fin1.var = 'i';
		fin2.var = 'x';
		System.out.println(var1 + "," + var2);
		System.out.println(fin1.var + "," + fin2.var);
	}
}
