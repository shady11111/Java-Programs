package com.example.Array;

public class Demo5 {
	public static void main(String[] args) {
		Animal[] animals=new Animal[2];
		animals[0]=new Dog();
		animals[1]=new Cat();
		
		for(Animal animal:animals) {
			System.out.println(animal);
			animal.makeSound();
			System.out.println();
		}
	}
}
interface Animal{
	void makeSound();
}
class Dog implements Animal{
	@Override
	public void makeSound() {
		System.out.println("bow wow");
	}
	@Override
	public String toString() {
		return "Dog sounds like:";
	}	
}
class Cat implements Animal{
	@Override
	public void makeSound() {
		System.out.println("meow");
	}
	@Override
	public String toString() {
		return "Cat sounds like:";
	}	
}