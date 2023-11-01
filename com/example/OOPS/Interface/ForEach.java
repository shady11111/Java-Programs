package com.example.OOPS.Interface;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(2,4,6,8,0);
		
//		Consumer<Integer> c=new ConsumerImplementation();
		
//		Consumer<Integer> c=new Consumer<Integer>() {
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		};
		
//		Consumer<Integer> c= i ->System.out.println(i);
		
//		values.forEach(c);
		
		values.forEach(i ->System.out.print(i+" "));
		
	}

}
//class ConsumerImplementation implements Consumer<Integer>{
////as this class is used only once, having an anonymous class is better
//	@Override
//	public void accept(Integer i) {
//		System.out.println(i);
//	}	
//}