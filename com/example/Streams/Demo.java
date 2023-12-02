package com.example.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<Person> people=new ArrayList<>();
		people.add(new Person("C",150));
		people.add(new Person("A",50));
		people.add(new Person("D",100));
		people.add(new Person("B",200));
		
		System.out.println("Hundred Dollar Club List:");
//		List<Person> hundredClub=new ArrayList<>();
		
//		for(Person person:people) {
//			if(person.billions>=100) {
//				hundredClub.add(person);
//			}
//		}
//		hundredClub.forEach(person->System.out.println(person.name));
		
		List<Person> hundredClub=people.stream().filter(person->person.billions>=100).
												 collect(Collectors.toList());
		hundredClub.forEach(person->System.out.println(person.name));
		
		System.out.println("Sorted By Name:");
		List<Person> sortedByName=people.stream().sorted(Comparator.comparing(person->person.name)).
										 		  collect(Collectors.toList());
			sortedByName.forEach(person->System.out.println(person.name));
		
		System.out.println("Hundred Dollar Club Sorted By Name:");
		List<Person> hundredClubSortedByName=people.stream().filter(person->person.billions>=100).
															 sorted(Comparator.comparing(person->person.name)).
															 collect(Collectors.toList());
		hundredClubSortedByName.forEach(person->System.out.println(person.name));
	}
}
class Person{
	String name;
	int billions;
	
	public Person(String name, int billions) {
		this.name=name;
		this.billions=billions;
	}
	
}