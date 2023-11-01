package com.example.basic.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.print("Enter the length of the fibonacci series:");
			int length = scn.nextInt();
			ArrayList<Integer> fibonacciSeries = fibonacci(length);
			System.out.println("Fibonacci series of length " + length + " is:");
			for (int fibNumber : fibonacciSeries)
				System.out.print(fibNumber + " ");
		}
	}

	private static ArrayList<Integer> fibonacci(int length) {
		ArrayList<Integer> fibonacciSeries = new ArrayList<Integer>();
		for (int i = 0; i < length; i++)
			fibonacciSeries.add(calculateFibonacci(i));
		return fibonacciSeries;
	}

	private static int calculateFibonacci(int number) {
		if (number <= 1)
			return number;
		return calculateFibonacci(number - 1) + calculateFibonacci(number - 2);
	}
}
