package com.example.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		int[] a= {10, 20, 30};
		m(a);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);		
	}
	static void m(int[] a) {
		for(int i=0;i<a.length;i++)
			a[i]++;
		System.out.println("m executed");
	}
}