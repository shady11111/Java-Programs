package com.example.Interface.Comparable;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		String[] array= {"ab", "cd", "bc,","bc","ac"};
		Arrays.sort(array);
		for(String s:array)
			System.out.println(s);
	}
}