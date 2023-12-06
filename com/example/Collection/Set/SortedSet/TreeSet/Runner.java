package com.example.Collection.Set.SortedSet.TreeSet;

public class Runner {

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree=new BinarySearchTree();
		binarySearchTree.add(50);
		binarySearchTree.add(30);
		binarySearchTree.add(10);
		binarySearchTree.add(40);
		binarySearchTree.add(80);
		binarySearchTree.add(100);
		binarySearchTree.add(60);
		
		binarySearchTree.levelOrder();
		binarySearchTree.preOrder();
		binarySearchTree.postOrder();
		binarySearchTree.inOrder();
	}
}