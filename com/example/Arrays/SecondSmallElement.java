package com.example.Arrays;

public class SecondSmallElement {

	public static void main(String[] args) {
		int[] a= {7,4,9,2,0};
		
		int small=a[0];
		int secondSmall=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]==small)continue;
			if(a[i]<small) {
				secondSmall=small;
				small=a[i];
			}
			else if(small==secondSmall || a[i]<secondSmall) {
				secondSmall=a[i];
			}
		}
		System.out.println(secondSmall);
	}
}