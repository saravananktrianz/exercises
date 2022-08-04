package com.trianz.exercises;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is TEst";
		char[] chars = str.toCharArray();
		int size = chars.length;
		for (int i=0; i < size; i++) {
			chars[i] = Character.isUpperCase(chars[i])
                    ? Character.toLowerCase(chars[i])
                    : Character.toUpperCase(chars[i]);

                    System.out.print(chars[i]);
		}
		

	}

}
