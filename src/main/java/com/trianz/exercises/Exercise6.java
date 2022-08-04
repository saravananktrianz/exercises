package com.trianz.exercises;

public class Exercise6 {

	public static void main(String[] args) {
		int[] arr1={18,19,21,15,16,11,13,12};
		int temp = 0;
		for (int i =0; i< arr1.length; i++) {
			for (int j=0; j<arr1.length-1; j++) {
				if (arr1[i] < arr1[j]) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
					
				}
			}
		}
		int start = 0;
		for(int i =0; i< arr1.length; i++) {
			if (i == 0) {
				start = arr1[i];
			} else {
				
				if (arr1[i] == start + i) {
					System.out.println("order number");
				} else {
					System.out.println("Missing number : " + (start + i));
					start = start + 1;
				}
			}
//			System.out.println(arr1[i]);
		}
//        System.out.println("Missing number from array arr1: "+missingNumber(arr1));
//        int[] arr2={5,3,1,2};
//        System.out.println("Missing number from array arr2: "+missingNumber(arr2));
	}

	
	public static int missingNumber(int[] arr)
    {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < arr.length; i++) {
            restSum+=arr[i];
        }
        int missingNumber=sum-restSum;
        return missingNumber;
    }
}
