package com.capgemini.oca;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(10, "ice-Cream"));
		list.add(new Product(11, "chocolate"));
		Product product = new Product(10, "ice-Cream");
		System.out.println(list.indexOf(product));
	}
}