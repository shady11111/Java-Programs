package com.example.Collection.List.DoubleLinkedList;

public class DoubleLinkedList {
	private Node first=null;
	private int count=0;
	
	public void add(Object element) {
		if(first==null) {
			first=new Node(element);
			count++;
			return;
		}
		Node current=first;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=new Node(element, null, current);
		count++;
	}
	public int size() {
		return count;
	}
	public void add(int index, Object element) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			Node n=new Node(element, first, null);
			first.previous=n;
			first=n;
			count++;
			return;
		}
		Node current=first;
		for(int i=1;i<index;i++) {
			current=current.next;
		}
		Node n=new Node(element, current.next, current);
		current.next=n;
		n.next.previous=n;
		count++;
	}
	public void remove(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			first.previous=null;
			count--;
			return;
		}
		Node current=first;
		for(int i=1;i<index;i++) {
			current=current.next;
		}
		current.next=current.next.next;
		if(current.next!=null) {
			current.next.previous=current;
		}
		count--;
	}
	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node current =first;
		for(int i=1;i<=index;i++) {
			current=current.next;
		}
		return current.element;
	}
}