package com.example.Collection.Set.SortedSet.TreeSet;

public class Node {
	int key;
	Node left, right;
	
	public Node(int k) {
		key=k;
	}
	public Node(int k, Node l, Node r) {
		key=k;
		left=l;
		right=r;
	}
}