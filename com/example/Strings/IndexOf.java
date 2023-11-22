package com.example.Strings;

public class IndexOf {

	public static void main(String[] args) {
		String s="Developer";
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf('q'));
		System.out.println(s.indexOf('e',5)); //indexOf(int ch, int fromIndex)
		System.out.println(s.indexOf('e',8));
		System.out.println(s.indexOf("lop"));
		String z="   Java    Developer    ";
		System.out.println(z);
		String zTrimmed=z.trim();//Java    Developer
//Removes spaces at the beginning and at the end
		System.out.println(zTrimmed);
	}
}
