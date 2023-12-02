package com.example.Collection.List.LinkedList;

public class Runner {

	public static void main(String[] args) {
		Node first=null;
		first=new Node(10);
		first.next=new Node(20);
		first.next.next=new Node(30);
		
		Node current =first;
		while(current!=null) {
			System.out.print(current.element+" ");
			current=current.next;
		}
	}
}