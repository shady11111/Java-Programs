package com.example.Collection.List.LinkedList;

public class Runner2 {

	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		for(int i=0;i<linkedList.size();i++) {
			System.out.print(linkedList.get(i)+" ");
		}
		System.out.println();
		linkedList.add(0,40);
		linkedList.add(2,50);
		for(int i=0;i<linkedList.size();i++) {
			System.out.print(linkedList.get(i)+" ");
		}
		System.out.println();
		linkedList.remove(0);
		linkedList.remove(3);
		for(int i=0;i<linkedList.size();i++)
			System.out.print(linkedList.get(i)+" ");
		System.out.println();
		linkedList.reverse();
		for(int i=0;i<linkedList.size();i++)
			System.out.print(linkedList.get(i)+" ");
	}
}