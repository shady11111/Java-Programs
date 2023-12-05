package com.example.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Set setHashSet=new HashSet();
		setHashSet.add('b');
		setHashSet.add('a');
		setHashSet.add('c');		
		System.out.println(setHashSet.size());
		for(Object e:setHashSet)
			System.out.print(e+" ");//a b c 
		
		System.out.println("\n");
		
		Set setLinkedHashSet=new LinkedHashSet();
		setLinkedHashSet.add('b');
		setLinkedHashSet.add('a');
		setLinkedHashSet.add('c');
		for(Object e:setLinkedHashSet)
			System.out.print(e+" ");//b a c
		
		System.out.println("\n");
		
		Set setTreeSet=new TreeSet();
		setTreeSet.add('b');
		setTreeSet.add('a');
		setTreeSet.add('c');
		for(Object e:setTreeSet)
			System.out.print(e+" ");//a b c 
	}
}