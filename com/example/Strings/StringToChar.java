package com.example.Strings;

public class StringToChar {

	public static void main(String[] args) {
		String b="Java";
		for(int i=0;i<b.length();i++) {
			char c=b.charAt(i);
			System.out.print(c);
		}
		System.out.println();
		char[] characterArray=b.toCharArray();
		for(char character:characterArray)
			System.out.print(character);
	}
}