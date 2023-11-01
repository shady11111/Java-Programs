package com.example.basic.VarArgs;

public class VarArgs {
	public static void main(String[] args) {
		VarArgs example = new VarArgs();

		example.printNumbers(); // No arguments
		example.printNumbers(1, 2, 3); // Three arguments
		example.printNumbers(10, 20); // Two arguments
	}

	public void printNumbers(int... numbers) {
		for (int num : numbers) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}


