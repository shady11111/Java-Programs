package com.example.Collection.Set.HashSet;

public class Runner {

	public static void main(String[] args) {
		HashSet setHashSet=new HashSet();
		setHashSet.add(45);
		setHashSet.add(495);
		setHashSet.add(15);
		setHashSet.add(29);
		setHashSet.add(9);
		setHashSet.add(9);
		
		System.out.println("Size: "+setHashSet.size());
		setHashSet.display();
	}
}