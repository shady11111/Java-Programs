package com.example.Array;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		System.out.println(search(a,40));
		System.out.println(search(a,4));
	}
	static int search(int[]a, int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key)
				return i;
		}
		return -1;
	}
}