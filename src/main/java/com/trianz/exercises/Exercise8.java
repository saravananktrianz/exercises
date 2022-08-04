package com.trianz.exercises;

import java.util.List;

public class Exercise8 {

	public static void main(String[] args) {
//		P   A   H   N
//		A P L S I I G
//		Y   I   R
		
		String str = "PAYPALISHIRING";
		int n = 3;
		
		String[] results = str.split("(?<=\\G.{" + n + "})");
		System.out.println(results);

		int size = results.length;
	}

}
