package com.trianz.exercises;

public class Exercise1 {

	public static void main(String[] args) {

		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				if ((i + 1) == 3 && (j + 1) == 4) {
					System.out.print("END");
				} else {
					System.out.print((j + 1) + "\t");
				}
				if ((j+1) < 4) {
					System.out.print("\t |");
				} else {
					System.out.println();
				}
			}
		}
	}

}
