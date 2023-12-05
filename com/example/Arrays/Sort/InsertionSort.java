package com.example.Arrays.Sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] numbers= {5,4,6,2,8,1};
		
		numbers=insertionSort(numbers);
//		System.out.println();
		for(int number:numbers)
			System.out.print(number+" ");
	}

	private static int[] insertionSort(int[] numbers) {
		for(int i=1;i<numbers.length;i++) {
			int key=numbers[i];
			int j=i-1;
			while(j>=0 && numbers[j]>key) {
				numbers[j+1]=numbers[j];
				j--;
			}
			numbers[j+1]=key;
		}		
		return numbers;
	}	
}