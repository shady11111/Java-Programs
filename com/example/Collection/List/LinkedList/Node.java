package com.example.Collection.List.LinkedList;

public class Node {
	Node next;
	Object element;
	
	Node(Object element){
		this.element=element;
		next=null;
	}
	Node(Object element, Node n){
		this.element=element;
		next=n;
	}
}