package com.capgemini.oca;

public class Arraryquestion {
	public static void main(String[] args) {
		int[] intarr = { 8, 16, 32, 64, 128 };

		for (int i = 0; i < intarr.length; i++) {
			System.out.print(intarr[i] + " ");
		}

		for (int i : intarr) {
			System.out.print(i +" ");
		}

	}
}
