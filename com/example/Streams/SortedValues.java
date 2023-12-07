package com.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortedValues {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(4,5,7,2,6,3);
		Stream<Integer> sortedValues=numbers.stream().filter(n->n%2==0).sorted();
//		Stream<Integer> sortedValues=numbers.parallelStream().filter(n->n%2==0);
//parallelStream is to work with mutiple threads,
//sorted() doesn't work with parallelStream, only filter does, as it's with mutiple threads		
		sortedValues.forEach(n->System.out.print(n+" "));
	}
}