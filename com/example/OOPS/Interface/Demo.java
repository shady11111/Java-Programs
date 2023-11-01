package com.example.OOPS.Interface;

public class Demo {

	public static void main(String[] args) {
		Shape s=new Circle();
		s.draw();
	}
}
interface Shape{
	void draw();
}
class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Circle drawn");
	}
}