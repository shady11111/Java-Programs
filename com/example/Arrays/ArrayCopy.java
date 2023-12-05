package com.example.Arrays;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b=new int[5];
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		System.arraycopy(a, 1, b, 0, 3);		
		System.out.println(Arrays.toString(b));
		
		System.arraycopy(a, 2, b, 3, 2);		
		System.out.println(Arrays.toString(b));
		
		System.arraycopy(a, 2, a, 3, 2);		
		System.out.println(Arrays.toString(a));
	}
}