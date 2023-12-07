package com.example.Streams;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(4,5,7,2,6,3);
		
//		Consumer<Integer> consumer=new Consumer<Integer>() {
//			public void accept(Integer n) {
//				System.out.print(n+" ");
//			}
//		};
		
//		Consumer<Integer> consumer=n->System.out.print(n+" ");
//		
//		numbers.forEach(consumer);
		
		numbers.forEach(n->System.out.print(n+" "));
	}
}