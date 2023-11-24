package com.example.Array.Sort;

public class QuickSort {
//Big O - worst case: O(n^2) - best case: O(n log(n)) 
//Divide and Conquer
//Recursion
//Pivot
//Tree
	public static void main(String[] args) {
		int[] numbers= {5,4,6,2,8,1};
		quickSort(numbers, 0, numbers.length-1);
//		numbers=quickSort(numbers);
//		System.out.println();
		for(int number:numbers)
			System.out.print(number+" ");
	}

	private static void quickSort(int[] numbers, int low, int high) {
		if(low<high) {
			int pivot=partition(numbers, low, high);
			
			quickSort(numbers, low, pivot-1);
			quickSort(numbers,pivot+1 , high);
		}
	}

	private static int partition(int[] numbers, int low, int high) {
		int pivot=numbers[high];
		int pointer=low-1;
		
		for(int j=low;j<high;j++) {
			if(numbers[j]<pivot) {
				pointer++;
				int temp=numbers[pointer];
				numbers[pointer]=numbers[j];
				numbers[j]=temp;
			}
		}
		int temp=numbers[pointer+1];
		numbers[pointer+1]=numbers[high];
		numbers[high]=temp;
		
		return pointer+1;
	}
	
}