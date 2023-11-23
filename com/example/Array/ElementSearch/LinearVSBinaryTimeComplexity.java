package com.example.Array.ElementSearch;

public class LinearVSBinaryTimeComplexity {

	public static void main(String[] args) {
		int []numbers=new int[100];
		int target=900;
		
		linearSearch(numbers, target);
		binarySearch(numbers, target);
	}
	static int linearSearch(int[]a, int key) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			count++;
			if(a[i]==key) {
				System.out.println("Steps taken by Linear Search: "+count);
				return i;
			}
		}
		System.out.println("Steps taken by Linear Search: "+count);
		return -1;
	}
	static int binarySearch(int[] a,int key) {
		int count=0;
		int start=0;
		int end=a.length-1;
		while(start<end) {
			count++;
			int mid=(start+end)/2;
			if(key==a[mid]) {
				System.out.println("Steps taken by Binary Search: "+count);
				return mid;
			}
			if(key>a[mid])start=mid+1;
			else end=mid-1;
		}
		System.out.println("Steps taken by Binary Search: "+count);
		return -1;
	}
}
