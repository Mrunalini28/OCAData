package com.capemini.oracle.correctedques;

import java.util.ArrayList;
import java.util.List;

public class Question26 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("mrunal");
		names.add("bran");
		names.add("rick");
		names.add("bran");
		if (names.remove("bran")) {
			names.remove("abc");
		}
		System.out.println(names);
	}

}
