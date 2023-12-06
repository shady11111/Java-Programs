package com.example.Collection.Set.SortedSet.TreeSet;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	private Node root=null;
	private int count=0;
//	private boolean flag;
//	private boolean removeFlag;
	
	public boolean add(int k) {
		int c=count;	//flag=true;
		root=addNode(root, k);
		return count==c+1;	//return flag;		
	}

	private Node addNode(Node n, int k) {
		if(n==null) {
			n=new Node(k);
			count++;
			return n;
		}
		if(k<n.key) {
			n.left=addNode(n.left, k);
		}
		else if(k>n.key){
			n.right=addNode(n.right, k);
		}
//		else {
//			flag=false;
//		}
		return n;
	}
	public int size() {
		return count;
	}
	public void levelOrder() {
		Queue<Node> queue=new LinkedList<Node>();
		
		if(root!=null) {
			queue.add(root);
		}
		while(!queue.isEmpty()) {
			Node n=queue.poll();
			System.out.print(n.key+" ");
			if(n.left!=null)queue.add(n.left);
			if(n.right!=null)queue.add(n.right);
		}
		System.out.println();
	}
	public void postOrder() {
		postOrder(root);
		System.out.println();
	}
	private void postOrder(Node n) {
		if(n==null)return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	public void preOrder() {
		preOrder(root);
		System.out.println();
	}
	private void preOrder(Node n) {
		if(n==null)return;
		System.out.print(n.key+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	private void inOrder(Node n) {
		if(n==null)return;
		inOrder(n.left);
		System.out.print(n.key+" ");
		inOrder(n.right);
	}
	public void remove(int key) {
//		removeFlag=false;
		root=removeNode(root, key);
//		if(removeFlag)count--;
	}
	Node removeNode(Node n, int key) {
		if(n==null)
			return null;
		if(key<n.key)
			n.left=removeNode(n.left, key);
		else if(key>n.key)
			n.right=removeNode(n.right, key);
		else {
//			removeFlag=true;
			if(n.left!=null && n.right!=null) {
				Node temp=getBiggestNode(n.left);
				n.key=temp.key;
				n.left=removeNode(n.left, temp.key);
			}
			else if(n.left!=null)
				n=n.left;
			else if(n.right!=null)
				n=n.right;
			else
				n=null;
		}
		return n;
	}
	private Node getBiggestNode(Node n) {
		if(n.right==null)return n;
		return getBiggestNode(n.right);
	}
}