package com.example.Strings;

public class IndexOf {

	public static void main(String[] args) {
		String s="Developer";
		System.out.println(s.indexOf('e'));//1
		System.out.println(s.indexOf('q'));//-1
		System.out.println(s.indexOf('e',5)); //indexOf(int ch, int fromIndex) //7
		System.out.println(s.indexOf('e',8));//-1
		System.out.println(s.indexOf("lop"));//4
		String z="   Java    Developer    ";
		System.out.println(z);
		String zTrimmed=z.trim();//Java    Developer
//Removes spaces at the beginning and at the end
		System.out.println(zTrimmed);
	}
}
