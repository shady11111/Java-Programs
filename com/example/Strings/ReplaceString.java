package com.example.Strings;

public class ReplaceString {

	public static void main(String[] args) {
		String s="abcd";
		System.out.println(s.replace('a', 'd')); //String replace(char oldChar, char newChar)
		System.out.println(s);
		System.out.println(s.replace("cd", "xy"));
		System.out.println(s.replace("abc","no"));	//String replace(CharSequence target, CharSequence replacement)
	}
}
