package com.example.Arrays;

public class SmallElement {

	public static void main(String[] args) {
		int[] a= {7,4,9,2,0};
		int small=a[0];
		
		for(int i=1;i<a.length;i++)
			if(a[i]<small)
				small=a[i];
		System.out.println(small);
	}
}