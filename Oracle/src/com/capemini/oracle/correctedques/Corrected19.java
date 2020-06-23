package com.capemini.oracle.correctedques;

public class Corrected19 {
	void readcard(int cardNo) throws Exception {
		System.out.println("Reading card");
	}

	void checkcard(int cardNo) throws RuntimeException {
		System.out.println("checking card");
	}
	public static void main(String[] args) {
		Corrected19 crr=new Corrected19();
		int cardnumber=1234;
		crr.checkcard(cardnumber);
		//crr.readcard(cardnumber);    error
	}
}