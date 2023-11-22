package com.example.Array;

public class BinarySearch {
//Binary Search is only for sorted arrays
	public static void main(String[] args) {
		int[] a= {0,2,4,6,9};
		System.out.println(binarySearch(a,40));
		System.out.println(binarySearch(a,4));
	}
	static int binarySearch(int[] a,int key) {
		int start=0;
		int end=a.length-1;
		while(start<end) {
			int mid=(start+end)/2;
			if(key==a[mid])return mid;
			if(key>a[mid])start=mid+1;
			else end=mid-1;
		}
		return -1;
	}
}