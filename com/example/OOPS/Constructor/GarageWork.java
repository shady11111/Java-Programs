package com.example.OOPS.Constructor;

public class GarageWork {

	public static void main(String[] args) {
		Ship s=new Ship("Red");
		System.out.println(s.color);
		//Garage g=new Garage();
		new Garage().changeColor(s);
		System.out.println(s.color);
	}

}
class Garage{
	void changeColor(Ship s) {
		s.color="Navy Blue";
	}
}
class Ship{
	String color;
	Ship(String color){
		this.color=color;
	}
}
