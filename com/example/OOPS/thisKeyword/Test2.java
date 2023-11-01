package com.example.OOPS.thisKeyword;

public class Test2 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.initialize(30);
		c1.display();
	}

}

class Circle {
	int radius;

	void initialize(int radius) {
		this.radius = radius;
		// radius=radius;//equating local to local, i.e parameter to parameter. In
		// display() the non-static variable radius never gets initialized and prints
		// the default value.
	}

	void display() {
		System.out.println(radius + " is the radius.");
	}
}