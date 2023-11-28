package com.example.Generics;

//import java.io.Serializable;

public class Demo2{
	public static void main(String[] args) {
		m1(10);
		System.out.println(m2("String",10.00));
		
		Printer<Animal> printer=new Printer<Animal>(new Dog());
		printer.print();		
	}
	public static <T> void m1(T data) {
		System.out.println(data);
	}
	public static <T,V> T m2(T data, V anotherData) {
		System.out.println(data);
		System.out.println(anotherData);
		return data;
	}
}
//Bounded generic
//class Printer<T extends Animal & Serializable>{}
class Printer<T extends Animal>{
	T thingToPrint;
	public Printer(T thingToPrint) {
		this.thingToPrint=thingToPrint;
	}
	public void print() {
		thingToPrint.sounds();
		System.out.println(thingToPrint);
	}
}
abstract class Animal{
	abstract void sounds();
	@Override
	public String toString() {
        return "Animal{}";
    }
}
class Dog extends Animal{
	@Override
	void sounds() {
		System.out.println("bow wow");
	}
	@Override
    public String toString() {
        return "Dog{}";
    } 
}