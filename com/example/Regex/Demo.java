package com.example.Regex;
import java.util.regex.*;

public class Demo {

	public static void main(String[] args) {
		int count=0;
		Pattern p=Pattern.compile("a");
		Matcher m=p.matcher("banana");
		while(m.find()) {
			count++;
		}
		System.out.println(count);
	}
}