package com.example.Collection.Set.HashSet;

public class Node {
//	int key;
	Object key;
	Node next;
	
//	Node(int key){
//		this.key=key;
//		next=null;
//	}
	Node(Object key){
		this.key=key;
		next=null;
	}
//	Node(int key, Node n){
//		this.key=key;
//		next=n;
//	}
	Node(Object key, Node n){
		this.key=key;
		next=n;
	}
}