package com.example.Arrays;

import java.util.Arrays;

public class ArraystoString {

	public static void main(String[] args) {
		int[] array= {10,20,30};
		m(array);
		System.out.println(Arrays.toString(array));
		System.out.println(array.toString());
		System.out.println(array);
//toString() of object class vs toString() of Arrays class
	}
	static void m(int[] a) {
		for(int i=0;i<a.length;i++)
			a[i]++;
		System.out.println("m executed");
	}
}
