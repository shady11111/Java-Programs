package com.example.OOPS.Constructor;

import java.util.Scanner;

public class Bikes {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			String response;
			do {
				System.out.println("Enter the model of the bike:");
				String model = scn.nextLine();
				System.out.println("Enter the color of the bike:");
				String color = scn.nextLine();
				Bike bike = new Bike(model, color);
				bike.display();

				System.out.println("Do you want to enter details for another bike? (yes/no)");
				response = scn.nextLine();
			} while (response.equalsIgnoreCase("yes"));
			System.out.println("Thank you for entering bike details.");
		}
	}
}

class Bike {
	String model;
	String color;
	int registrationNumber;
	static int number = 1000;

	Bike(String model, String color) {
		this.model = model;
		this.color = color;
		registrationNumber = ++number;
	}

	void display() {
		System.out.println(model + " bike of color " + color + ", has a registraion number " + registrationNumber);
	}

}
