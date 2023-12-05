package com.example.Collection.Queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Demo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Deque dequeArrayDeque=new ArrayDeque();
		Deque dequeLinkedList=new LinkedList();
		
		dequeArrayDeque.add(20);
		dequeArrayDeque.add(10);
		dequeArrayDeque.add(40);
		dequeArrayDeque.add(30);
		while(!dequeArrayDeque.isEmpty()) {
			System.out.print(dequeArrayDeque.poll()+" ");
		}
		System.out.println();
		dequeLinkedList.add(20);
		dequeLinkedList.add(10);
		dequeLinkedList.add(40);
		dequeLinkedList.add(30);
		while(!dequeLinkedList.isEmpty()) {
			System.out.print(dequeLinkedList.poll()+" ");
		}
	}
}