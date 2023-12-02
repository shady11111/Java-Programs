package com.example.Collection.List.LinkedList;

public class LinkedList {
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
		current.next=new Node(element);
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
			first=new Node(element, first);
			count++;
			return;
		}
		Node current=first;
		for(int i=1;i<index;i++) {
			current=current.next;
		}
		current.next=new Node(element,current.next);
		count++;
	}
	public void remove(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		Node current=first;
		for(int i=1;i<index;i++) {
			current=current.next;
		}
		current.next=current.next.next;
		count--;
	}
	public void reverse() {
		Node previous=null, current=first, next=null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		first=previous;
	}	
	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node current=first;
		for(int i=1;i<=index;i++) {
			current=current.next;
		}
		return current.element;
	}
}