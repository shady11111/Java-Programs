package com.example.OOPS.Overloading;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("Standard main method");
        for (String arg : args) {
            System.out.println(arg);
        }
        main();
        main(42);
        main("Hello", "World");
        
//        Output:
//        	Standard main method
//        	Empty main method
//        	Overloaded main method with int parameter
//        	Number: 42
//        	Overloaded main method with two String parameters
//        	Arg1: Hello
//        	Arg2: World
	}
	public static void main() {
		System.out.println("Empty main method");
	}
	
	public static void main(int number) {
        System.out.println("Overloaded main method with int parameter");
        System.out.println("Number: " + number);
    }

    public static void main(String arg1, String arg2) {
        System.out.println("Overloaded main method with two String parameters");
        System.out.println("Arg1: " + arg1);
        System.out.println("Arg2: " + arg2);
    }
}
