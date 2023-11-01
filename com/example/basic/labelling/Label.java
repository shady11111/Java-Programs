package com.example.basic.labelling;

public class Label {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int target = 5;
		boolean found = false;

		outerLoop: // Label for the outer loop
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == target) {
					found = true;
					break outerLoop; // Break out of the outer loop
				}
			}
		}

		if (found) {
			System.out.println("Target found in the matrix.");
		} else {
			System.out.println("Target not found in the matrix.");
		}
	}

}
