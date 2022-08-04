package com.trianz.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		System.out.println("Input integer array size ");
		Scanner inputArraySize = new Scanner(System.in);
		
		int[] arr = new int[inputArraySize.nextInt()];
		
		System.out.println("Input values for integer array one by one based on array size ");
		int size = arr.length;
		
		for (int i=0; i<size; i++) {
			arr[i] = inputArraySize.nextInt();
		}
		
		System.out.print("Array values are [ ");
		for (int i=0; i<size; i++) {
			System.out.print(arr[i]);
			if (i + 1 == size) {
				System.out.print(" ] ");
			} else {
				System.out.print(", ");
			}
		}		
		
		System.out.println();
		int temp = 0;
		for (int i=0; i<size; i++) {
			for (int j=1; j<size-1; j++) {
				if (arr[j -1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.printf("After %d iteration %s ", i+1,  Arrays.toString(arr));
			System.out.println();
		}
	}

}
