package com.capgemini.set_answers;

public class Set242 {
	public static void main(String[] args) {
		String[] strs = { "A", "B" };
		int idx = 0;
		for (String s : strs) {
			strs[idx].concat("elements" + idx);
			idx++;
		}
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}
}