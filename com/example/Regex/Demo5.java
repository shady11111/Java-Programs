package com.example.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo5 {

	public static void main(String[] args) {
		Pattern p1=Pattern.compile("([a-z]+)\\1");
		Matcher m=p1.matcher("abccdfe");
		while(m.find()) {
			System.out.println(m.group());
		}
		System.out.println();
		m=p1.matcher("banana");
		while(m.find()) {
			System.out.println(m.group());
		}
		System.out.println();
		
		Pattern p2=Pattern.compile("([a-z]+)\\1+");
		m=p2.matcher("bananaa");
		while(m.find())
			System.out.println(m.group());
		System.out.println();
		
//		Pattern p3=Pattern.compile("([a-z])\\1\\1\\1\\1");
		Pattern p3=Pattern.compile("([a-z])\\2");
		m=p3.matcher("bananaa");
		while(m.find())
			System.out.println(m.group());
	}
}