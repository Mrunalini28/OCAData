package com.capgemini.set_answers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Set19 {
	public static void main(String[] args) {
		String[] arr = { "hi ", "how", "are", "you" };
		List<String> arrlist = new ArrayList<String>(Arrays.asList(arr));
		if (arrlist.removeIf(s -> {
			System.out.print(s);
			return s.length() <= 2;
		}))
			System.out.println("removed");
	}
}