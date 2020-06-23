package com.capemini.oracle.correctedques;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Corrected113 {
public static void main(String[] args) {
	LocalDateTime dt =LocalDateTime.of(2014, 7, 3, 1, 1);
	dt.plusDays(30);
	dt.plusMonths(1);
	//System.out.println(dt format (DateTimeFormatter.ISO_DATE));
	
}
}
