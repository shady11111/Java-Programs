package com.example.Collection.List.Vector.Stack;

public class Runner {

	public static void main(String[] args) {
		Stack numbers=new Stack();
		numbers.push(15);
		numbers.push(8);
		numbers.push(10);
		numbers.push(10);
		numbers.push(10);
		numbers.show();
		System.out.println();
		
		System.out.println(numbers.pop());
		numbers.show();
		System.out.println();
		
		System.out.println(numbers.peek());
		numbers.show();
		System.out.println();
		
		System.out.println(numbers.size());
		System.out.println(numbers.isEmpty());
		System.out.println();
		
		DStack dStackNumbers=new DStack();
		dStackNumbers.push(15);
		dStackNumbers.push(15);
		dStackNumbers.push(15);
		dStackNumbers.push(15);
		dStackNumbers.push(15);
		dStackNumbers.push(15);
		dStackNumbers.show();
		
		dStackNumbers.pop();
		dStackNumbers.pop();
		dStackNumbers.show();
	}
}