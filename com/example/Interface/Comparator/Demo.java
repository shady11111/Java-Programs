package com.example.Interface.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
	public static void main(String[] args) {
		String[] string= {"abc","a","ab","abcd"};
		Arrays.sort(string , new LengthComparator());
		for(String s:string )
			System.out.println(s);		
	}
}
class LengthComparator implements Comparator<Object>{
	public int compare(Object object1, Object object2) {
		return ((String)object1).length()-((String)object2).length();
	}
}