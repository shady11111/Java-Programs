package com.example.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		ArrayList<String> strings= new ArrayList<String>();
		strings.add("b");
		strings.add("a");
		strings.add("c");
		strings.add("A");
		
		Collections.sort(strings);
		for(String string:strings) {
			System.out.println(string);
		}
	}
}