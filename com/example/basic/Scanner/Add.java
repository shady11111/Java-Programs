package com.example.basic.Scanner;
import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter 2 numbers:");
			int a=scn.nextInt();
			int b=scn.nextInt();
			System.out.println(a+"+"+b+"="+a+b);
		}
	}
}

