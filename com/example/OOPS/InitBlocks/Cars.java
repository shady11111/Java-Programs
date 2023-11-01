package com.example.OOPS.InitBlocks;

public class Cars {

	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car("blue");
		c1.display();
		c2.display();
	}

}
class Car{
	int registrationNumber;
	String color;
	static int number=1000;
	Car(){
		color="white";
	}
	Car(String color){
		this.color=color;
	}
	{
		registrationNumber=++number;
	}
	void display() {
		System.out.println("Car with a registration number "+registrationNumber +", has a color of "+ color);
	}
}
