package com.example.OOPS.Abstract;

public class Demo2 {

	public static void main(String[] args) {
		
	}

}
abstract class Bike{
	abstract void starts();
	abstract void accelerates();
	abstract void stops();
}
class Ducati extends Bike{
	@Override
	void starts() {
		System.out.println("Ducati starts");
	}
	@Override
	void accelerates() {
		System.out.println("Ducati accelerates");
	}
	@Override
	void stops() {
		System.out.println("Ducati stops");
	}
}
