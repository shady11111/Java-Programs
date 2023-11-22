package com.example.Array;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		int[] a= {0,1,3,4,5,6,7,8};
		System.out.println(binarySearch(a, 9, 0, a.length-1));
		System.out.println(binarySearch(a, 5, 0, a.length-1));
	}
	static int binarySearch(int[] a, int key, int start, int end) {
		if(start>end) return -1;
		int mid=(start+end)/2;
		if(key==a[mid])return mid;
		if(key<a[mid])return binarySearch(a, key, start, mid-1);
		else return binarySearch(a, key, mid+1, end);
	}
}