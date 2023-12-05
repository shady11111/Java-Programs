package com.example.Arrays.Sort;

public class SelectionSort {
//Big O - O(n^2) - Quadratic time
	public static void main(String[] args) {
		int[] numbers1= {5,4,6,2,8,1};
		
		int[] numbers2= {5,4,6,2,8,1};
		
		numbers1=selectionMinimumSort(numbers1);
//		System.out.println();
		System.out.println("Minimum sort:");
		for(int number:numbers1)
			System.out.print(number+" ");
		
		System.out.println();
//		System.out.println();
		
		numbers2=selectionMaximumSort(numbers2);
		System.out.println("Maximum sort:");
		for(int number:numbers2)
			System.out.print(number+" ");
	}
	static int[] selectionMinimumSort(int [] numbers) {
//sorting minimum numbers first
		int minimumIndex=-1;
		for(int i=0;i<numbers.length-1;i++) {
			minimumIndex=i;
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[minimumIndex]>numbers[j]) {
					minimumIndex=j;					
				}
			}
			int temp=numbers[minimumIndex];
			numbers[minimumIndex]=numbers[i];
			numbers[i]=temp;
			
//			System.out.println();
//			for(int number:numbers)
//				System.out.print(number+" ");
		}
			
		return numbers;
	}
	static int[] selectionMaximumSort(int [] numbers) {
//sorting maximum numbers first
		int maximumIndex=-1;
		for(int i=numbers.length-1;i>=1;i--) {
			maximumIndex=i;
			for(int j=i-1;j>=0;j--) {
				if(numbers[maximumIndex]<numbers[j]) {
					maximumIndex=j;
				}
			}
			int temp=numbers[maximumIndex];
			numbers[maximumIndex]=numbers[i];
			numbers[i]=temp;
		}
		return numbers;
	}
}