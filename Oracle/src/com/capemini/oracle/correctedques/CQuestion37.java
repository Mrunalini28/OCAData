package com.capemini.oracle.correctedques;

public class CQuestion37 {

	public static void main(String[] args) {
		CQuestion37 que=new CQuestion37();
		System.out.println(isavail+""); 
		isavail=que.dostuff();
		System.out.println(isavail);
	}
	public static boolean dostuff() {
		return !isavail;	
		}
	static boolean isavail=false;
}
