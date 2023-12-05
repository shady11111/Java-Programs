package com.example.Collection.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class Demo2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		SortedSet setTreeSet=new TreeSet();
		setTreeSet.add(40);
		setTreeSet.add(20);
		setTreeSet.add(30);
		setTreeSet.add(10);
		setTreeSet.add(50);
		
		System.out.println("Smallest:"+setTreeSet.first());//Smallest:10
		System.out.println("Largest:"+setTreeSet.last());//Largest:50
		
		SortedSet headSet=setTreeSet.headSet(40);
		display(headSet);//10 20 30 
		SortedSet tailSet=setTreeSet.tailSet(40);
		display(tailSet);//40 50 
		SortedSet subSet=setTreeSet.subSet(20,50);
		display(subSet);//20 30 40 
	}
	@SuppressWarnings("rawtypes")
	static void display(SortedSet setTreeSet) {
		for(Object o:setTreeSet)
			System.out.print(o+" ");
		System.out.println();
	}
}