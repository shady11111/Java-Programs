package com.example.Collection.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo {
//PriorityQueue sorts objects according to either Comparable or Comparator implementation
//LinkedList and ArrayDeque follows FIFO
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Queue queuePriorityQueue=new PriorityQueue();
		Queue queueLinkedList=new LinkedList();
		Queue queueArrayDeque=new ArrayDeque();
		
		queuePriorityQueue.add(20);
		queuePriorityQueue.add(40);
		queuePriorityQueue.add(30);
		queuePriorityQueue.add(10);
		while(!queuePriorityQueue.isEmpty()) {
//Sorts and outputs the result
			System.out.print(queuePriorityQueue.poll()+" ");
		}
		System.out.println();
		queueLinkedList.add(20);
		queueLinkedList.add(40);
		queueLinkedList.add(30);
		queueLinkedList.add(10);
		while(!queueLinkedList.isEmpty()) {
			System.out.print(queueLinkedList.poll()+" ");
		}
		System.out.println();
		queueArrayDeque.add(20);
		queueArrayDeque.add(40);
		queueArrayDeque.add(30);
		queueArrayDeque.add(10);
		while(!queueArrayDeque.isEmpty()) {
			System.out.print(queueArrayDeque.poll()+" ");
			System.out.println(queueArrayDeque.peek()+" ");
		}
	}
}