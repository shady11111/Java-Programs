package com.example.OOPS.UpDownCast;

import java.util.Scanner;

public class Consumer {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the vegetable name:");
			String vegetable=scn.next();
			
//			Shop s=new Shop();
			Vegetable v=Shop.sell(vegetable.toLowerCase());
			if(v instanceof Carrot) {
				((Carrot)v).prepareHalwa();
			}
			if(v instanceof Potato) {
				((Potato)v).fries();
			}
		}
	}
}
class Shop{
	static Vegetable sell(String vegetableName) {
		if(vegetableName.equals("carrot")){
			return new Carrot();
		}
		if(vegetableName.equals("potato")){
			return new Potato();
		}
		System.out.println(vegetableName+ " is out of stock");
		return null;
	}
}
interface Vegetable{
	
}
class Carrot implements Vegetable{
	void prepareHalwa() {
		System.out.println("Halwa ready");
	}
}
class Potato implements Vegetable{
	void fries(){
		System.out.println("Fries ready");
	}
}