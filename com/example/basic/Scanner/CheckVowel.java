package com.example.basic.Scanner;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a character to check if it's vowel:");
			char c=scn.next().toLowerCase().charAt(0);
			if(Character.isAlphabetic(c)) {
				switch(c) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						System.out.println("Given character is an vowel.");
						break;
					default:
						System.out.println("Given character is a consonant.");
				}
			}
			else
				System.out.println("Given character is not an alphabet.");			
		}
	}

}
