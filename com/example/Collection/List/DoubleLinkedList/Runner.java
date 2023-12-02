package com.example.Collection.List.DoubleLinkedList;

public class Runner {

	public static void main(String[] args) {
		DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
		doubleLinkedList.add(10);
		doubleLinkedList.add(20);
		doubleLinkedList.add(30);
		for(int i=0;i<doubleLinkedList.size();i++) {
			System.out.print(doubleLinkedList.get(i)+" ");
		}
		System.out.println();
		
		doubleLinkedList.remove(0);
		for(int i=0;i<doubleLinkedList.size();i++) {
			System.out.print(doubleLinkedList.get(i)+" ");
		}
	}
}