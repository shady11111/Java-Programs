package com.example.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		int []a=new int[] {1,2,3};
		int b[]=a;
		
		System.out.println(b[0]);
		
		b[0]=0;
		System.out.println(a[0]);
	}
}