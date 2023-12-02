package com.example.Collection.List.DoubleLinkedList;

public class Node {
	Object element;
	Node previous, next;
	
	Node(Object element){
		this.element=element;
		next=null;
		previous=null;
	}
	Node(Object element, Node n, Node p){
		this.element=element;
		previous=p;
		next=n;
	}
}