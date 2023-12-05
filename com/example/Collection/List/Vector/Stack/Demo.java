package com.example.Collection.List.Vector.Stack;

import java.util.Stack;

public class Demo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack stack=new Stack();
		stack.push(10);
		stack.push(20);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}