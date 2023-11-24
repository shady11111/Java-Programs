package com.example.Array.Sort;

public class BubbleSort {
//Big O - O(n^2) - Quadratic time
	public static void main(String[] args) {
		int[] numbers= {5,4,6,2,8,1};
		
//		numbers=bubbleSort(numbers);
//		System.out.println();
		for(int number:bubbleSort(numbers))
			System.out.print(number+" ");
	}
	static int[] bubbleSort(int [] numbers) {
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length-i-1;j++)
				if(numbers[j]>numbers[j+1]) {
					int temp=numbers[j+1];
					numbers[j+1]=numbers[j];
					numbers[j]=temp;
				}
//			System.out.println();
//			for(int number:numbers)
//				System.out.print(number+" ");
		}
		return numbers;
	}
}
