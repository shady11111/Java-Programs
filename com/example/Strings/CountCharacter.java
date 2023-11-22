package com.example.Strings;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		try(Scanner scn=new Scanner(System.in)){
			System.out.println("Enter a word to check any character count in it:");
			String word=scn.next();
			System.out.println("Enter a character to count in "+ word);
			//char character=scn.next(); //compiler error, conversion from character to String
			char character=scn.next().charAt(0);
			System.out.println(countCharacter(character, word)+" is the total count of character in "+word);
		}
	}
	static int countCharacter(char character, String word) {
		return word.length()-word.replace(String.valueOf(character), "").length();
	}
}