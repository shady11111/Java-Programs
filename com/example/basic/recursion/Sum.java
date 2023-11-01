package com.example.basic.recursion;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter 2 numbers, to start from and end with:");
			int start = scn.nextInt();
			int end = scn.nextInt();
			System.out.println(sum(start, end));
		}
	}

	private static int sum(int start, int end) {
		if (start == end)
			return end;
		return start + sum(start + 1, end);
	}
}
