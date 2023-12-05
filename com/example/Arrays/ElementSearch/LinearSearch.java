package com.example.Arrays.ElementSearch;

public class LinearSearch {
// Time Complexity - Big O - O(n) - Linear time
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		System.out.println(linearSearch(a,40));
		System.out.println(linearSearch(a,4));
	}
	static int linearSearch(int[]a, int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key)
				return i;
		}
		return -1;
	}
}