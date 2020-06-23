package com.capemini.oracle.correctedques;

public class TestC1C2I extends C1 {
	public static void main(String[] args) {
		C2 obj1 = new C1();
		I obj2 = new C1();
        //C2 s=obj2;   ....compilation error casting
//        I t =obj1;   
//		t.displayI();    
//		s.displayC2();
	}
}
