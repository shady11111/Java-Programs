package com.example.Regex;

public class Demo3 {

	public static void main(String[] args) {
		String s1="ab23c12d";
		String s2=s1.replaceAll("[0-9]","");
		System.out.println(s2);
	}
}