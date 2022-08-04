package com.trianz.exercises;

import java.util.Arrays;

public class Exercise2 {

	public static void main(String[] args) {

		int arr[] = new int[]{18,56,76,89,100,398,21,234};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int smallest = 0;
		int largest = 0;
		
		int size = arr.length;
		for (int i = 0; i< size; i++) {
			if (i == 0) {
				smallest = arr[i];
				largest = arr[i];
			}
			if (largest < arr[i]) {
				largest = arr[i];
			}
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest number is : " + smallest);
		System.out.println("Largest number is : " + largest);
	}

}
