package com.trianz.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] arr = new int[input.nextInt()];
		System.out.println(arr.length);
		int size = arr.length;
		for (int i=0; i<size; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print("The arr value is : [ ");
		for (int i=0; i<size; i++) {
			System.out.print(arr[i]);
			if (i + 1 == size) {
				
			} else {
				System.out.print(",");
			}
		}		
		System.out.print(" ]");

		Map<Integer, Integer> occurences = new HashMap<Integer, Integer>();
		for (int i=0; i<size; i++) {
			
			if (occurences.get(arr[i]) == null) {
				occurences.put(arr[i], 1);
			} else {
				occurences.put(arr[i], occurences.get(arr[i]) + 1);
			}
		}
		System.out.println(occurences);
		for (int val : occurences.keySet()) {
			System.out.println("The occurence of " + val + " is : "+ occurences.get(val));
		}
	}

}
