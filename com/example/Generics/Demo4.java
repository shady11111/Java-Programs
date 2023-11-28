package com.example.Generics;

public class Demo4 {

	public static void main(String[] args) {
		Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(3);

        System.out.println(circle1.compareTo(circle2));
	}
}
interface Comparable<E>{
	int compareTo(E e);
}
class Circle implements Comparable<Circle>{
	private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
	public int compareTo(Circle circle) {
		if (this.radius < circle.radius) {
            return -1;
        } else if (this.radius > circle.radius) {
            return 1;
        } else {
            return 0;
        }
	}
}