package com.example.Strings;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		try(Scanner scn=new Scanner(System.in)){
			System.out.println("Enter a word to check any character count in it:");
			String word=scn.next();
			System.out.println("Total vowel count is "+countVowel(word));
		}
	}
	static int countVowel(String word) {
		int count=0;
		for(int i=0; i<word.length();i++) {
			if(word.toLowerCase().charAt(i)=='a'||word.toLowerCase().charAt(i)=='e'||word.toLowerCase().charAt(i)=='i'||word.toLowerCase().charAt(i)=='o'||word.toLowerCase().charAt(i)=='u')count++;
		}
		return count;
	}
}
