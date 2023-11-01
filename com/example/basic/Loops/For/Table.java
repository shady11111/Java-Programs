package com.example.basic.Loops.For;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number for the multiplication table:");
			int t=scn.nextInt();
			for(int i=1;i<=10;i++) {
				System.out.println(t+"*"+i+"="+t*i);
			}
		}
	}

}
