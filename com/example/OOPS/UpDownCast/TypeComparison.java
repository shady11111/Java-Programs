package com.example.OOPS.UpDownCast;

public class TypeComparison {

//instanceof operator is used to check whether an object is an instance of a particular class or interface, or one of its subclasses or subinterfaces.
//It checks based on the actual object's type, not the reference variable's type.
	
	public static void main(String[] args) {
		Animal animal1 = new Dog();        
		if (animal1 instanceof Dog && animal1 instanceof Animal && animal1 instanceof Object) {
            System.out.println("The dog1 is a Dog, as it is referring to Dog object and an Animal and the Object too, as Dog extends Animal, and Animal extends Object");
        }
        
        if (animal1 instanceof Dog && (animal1.getClass() == Dog.class)) {
//Dog.class syntax is used to obtain the Class object associated with the Dog class. 
            System.out.println("The animal1 is a Dog.");
        } else {
            System.out.println("The animal1 is not a Dog.");
        }
        
        System.out.println();
        
        Dog dog1=(Dog)animal1;
        if (dog1 instanceof Dog && dog1 instanceof Animal) {
            System.out.println("The dog1 is a Dog, as it is referring to Dog object and an Animal too, as Dog extends Animal");
        }
        
        System.out.println();
        
        Dog dog2 =new Dog();
        if(dog2 instanceof Animal && dog2 instanceof Dog) {
        	System.out.println("The dog is an Animal and a Dog, as referring to Dog object");
        } else {
            System.out.println("The dog is not an Animal.");
        }
        
        System.out.println();
        
        Animal animal2=dog2;
        if (animal2 instanceof Dog) {
            System.out.println("The animal is a Dog, as it is referring to Dog object");
        } else {
            System.out.println("The animal is not a Dog.");
        }
        
        System.out.println();
        
        Animal animal3=new Animal();
        if (animal3 instanceof Dog) {
            System.out.println("The animal is a Dog, as it is referring to Dog object");
        } else {
            System.out.println("The animal is not a Dog, as it referring to Animal object.");
        }
        
	}
}