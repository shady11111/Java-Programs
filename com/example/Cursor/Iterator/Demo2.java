package com.example.Cursor.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("David");

		// Creating an iterator for the names list
		Iterator<String> iterator = names.iterator();

		// Iterating over the names list using the iterator
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
	}
}