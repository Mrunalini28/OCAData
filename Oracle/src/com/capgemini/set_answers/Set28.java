package com.capgemini.set_answers;

public class Set28 {
	void readcard(int cardno) throws Exception {
		System.out.println("reading");
	}

	void checkcard(int cardno) throws RuntimeException {
		System.out.println("checking");
	}
	public static void main(String[] args) {
		Set28 set=new Set28();
		int cardno=12344;
		set.checkcard(cardno);
		//set.readcard(cardno); .......error
	}
}
