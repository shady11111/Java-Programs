package com.example.Strings;

public class RemoveAllSpaces {

	public static void main(String[] args) {
		String z="   Java    Developer    ";
		System.out.println(z.replace(" ", ""));
		System.out.println(z);//Literal is immutable...is this the context?
		System.out.println(z=z.replace(" ", ""));
		System.out.println(z);
	}
}
