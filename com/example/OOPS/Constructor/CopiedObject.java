package com.example.OOPS.Constructor;

public class CopiedObject {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 8);
		Rectangle r2 = new Rectangle(7);
		Rectangle r3 = new Rectangle(r1);
		Rectangle r4 = new Rectangle(r2);
		r1.display();
		r2.display();
		r3.display();
		r4.display();
	}
}

class Rectangle {
	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	Rectangle(int squareLength) {
		this(squareLength, squareLength);
	}

	Rectangle(Rectangle r) {// copying object
		this.length = r.length;
		this.breadth = r.breadth;
	}

	void display() {
		System.out.println("Rectangle has a breadth of " + breadth + " units and length of " + length + " units.");
	}
}
