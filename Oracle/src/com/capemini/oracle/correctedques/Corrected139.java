package com.capemini.oracle.correctedques;

public class Corrected139 {
	public static void main(String[] args) {
		int[][] arr = new int[2][4];
		arr[0] = new int[] { 1, 3, 5, 7 };
		arr[1] = new int[] { 1, 3 };
		for (int[] a : arr) {
			//System.out.println(arr.length);    length is 2
			for (int i = 0; i < arr.length; i++) {
				
				System.out.println(a[i] + " ");
			}
			System.out.println();
		}
	}
}
