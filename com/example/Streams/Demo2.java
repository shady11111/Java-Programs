package com.example.Streams;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(4,5,7,2,6,3);
		
//		int sum=0;
//		for(int number:numbers) {
//			if(number%2==0) {
//				number=number*2;
//				sum+=number;
//			}
//		}
//		System.out.println(sum);
		
//filter():takes object of Predicate
//		Predicate<Integer> predicate=new Predicate<>() {
//			@Override
//			public boolean test(Integer t) {
//				if(t%2==0)return true;
//				else return false;
//			}			
//		};
//		Predicate<Integer> predicate=t->t%2==0;
		
//map():takes object of Function
//		Function<Integer, Integer> function=t-> t*2;
		
//		Stream<Integer> stream1=numbers.stream();
//		Stream<Integer> stream2=stream1.filter(number->number%2==0);
//	    //stream1.forEach(number->System.out.print(number+" "));	//once a stream is used, can't be reused
//		Stream<Integer> stream3=stream2.map(number->number*2);
//		int result=stream3.reduce(0,(c,e)->c+e);
//		System.out.println(result);
		
//		int result=numbers.stream().filter(predicate).map(function).reduce(0,(c,e)->c+e);
		
		int result=numbers.stream().filter(number->number%2==0).map(number->number*2).reduce(0,(c,e)->c+e);
		System.out.println(result);
	}
}