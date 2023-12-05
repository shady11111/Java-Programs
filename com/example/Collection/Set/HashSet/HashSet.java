package com.example.Collection.Set.HashSet;

public class HashSet {
	private Node[] a=new Node[10];
	private int count=0;
	
	public boolean add(Object k) {
	//public boolean add(int k) {
	//	int index=k%a.length;
		int index=k.hashCode()%a.length;
		index=Math.abs(index);
		if(a[index]==null) {
			a[index]=new Node(k);
			count++;
			return true;
		}		
		Node current=a[index];
		Node previous=null;
		while(current!=null) {
//			if(k==current.key)return false;
			if(k.equals(current.key))return false;
			previous=current;
			current=current.next;
		}
		previous.next=new Node(k);
		count++;
		return true;
	}
	public int size() {
		return count;
	}
	public void display() {
		for(int i=0;i<a.length;i++) {
			Node current=a[i];
			while(current!=null) {
				System.out.print(current.key+" ");
				current=current.next;
			}
		}
		System.out.println();
	}
}