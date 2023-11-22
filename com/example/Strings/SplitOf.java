package com.example.Strings;

public class SplitOf {

	public static void main(String[] args) {
		String string="Java is Easy";
		String[] stringArray=string.split(" ");
		for(String s:stringArray) {
			System.out.println(s);
		}
	}
}
