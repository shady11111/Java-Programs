package com.example.Arrays.Sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] numbers= {5,4,6,2,8,1};
		mergeSort(numbers, 0, numbers.length-1);
//		numbers=quickSort(numbers);
//		System.out.println();
		for(int number:numbers)
			System.out.print(number+" ");
	}

	private static void mergeSort(int[] numbers, int left, int right) {
		if(left<right) {
			int mid=(left+right)/2;
			mergeSort(numbers, left, mid);
			mergeSort(numbers, mid+1, right);
			
			merge(numbers, left, mid, right);
		}			
	}

	private static void merge(int[] numbers, int left, int mid, int right) {
		int leftSize=mid+1-left;
		int rightSize=right-mid;
		int[] leftArray=new int[leftSize];
		int[] rightArray=new int[rightSize];
		
		for(int i=0;i<leftSize;i++) {
			leftArray[i]=numbers[left+i];
		}
		for(int i=0;i<rightSize;i++) {
			rightArray[i]=numbers[mid+1+i];
		}
		
		int x=0,y=0;
		int z=left;
		
		while(x<leftSize && y<rightSize) {
			if(leftArray[x]<=rightArray[y]) {
				numbers[z]=leftArray[x];
				x++;
			}
			
			else {
				numbers[z]=rightArray[y];
				y++;
			}
			z++;
		}
		
		while(x<leftSize) {
			numbers[z]=leftArray[x];
			x++;
			z++;
		}
		while(y<rightSize) {
			numbers[z]=rightArray[y];
			y++;
			z++;
		}	
	}	
}