package com.example.basic.Scanner;
import java.util.Scanner;

public class NextNextLine {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			String s1=scn.next();
			String s2=scn.nextLine();
			System.out.println(s1);
			System.out.println(s2);
		}
	}

}
