package com.example.Strings;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		try(Scanner scn=new Scanner(System.in)){
			System.out.println("Enter 2 words to compare:");
			String s1=scn.next();
			String s2=scn.next();
			System.out.println(anagram(s1, s2));
		}
	}
	static boolean anagram(String s1, String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		while(s1.length()==s2.length()) {
			char character=s1.charAt(0);
			s1=s1.replace(String.valueOf(character),"");
			s2=s2.replace(character+"","");
			if(s1.length()==0&&s2.length()==0)
				return true;
		}
		return false;
	}
}
