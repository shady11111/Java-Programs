package com.example.basic.VarArgs;

public class CommandLineArguments {

	public static void main(String[] args) {
//here when executed java.lang.ArrayIndexOutOfBoundsException occurs.
//		String firstArg = args[0];
//	    System.out.println("First argument: " + firstArg);
		
	    int numArgs = args.length;
	    System.out.println("Number of arguments: " + numArgs);
	    
//	    for (String arg : args)
//	        System.out.println("Argument: " + arg);
	    
	 // Assuming the first command-line argument is an integer
//	    String arg1 = args[0];
//	    int intValue = Integer.parseInt(arg1);
//	    System.out.println("Integer value: " + intValue);
	    
	  //Custom Object Conversion:
	 // Assuming command-line arguments in the format: "John 30"
//	    String arg1 = args[0];
//	    String arg2 = args[1];
//
//	    Person person = new Person(arg1, Integer.parseInt(arg2));
//
//	    System.out.println("Created Person: " + person.getName() + " - " + person.getAge());
	}
	
	//Custom Object Conversion:
//COnverting command-line arguments into custom objects, parse manually and construct the objects based on the argument values.
	//For example, if you have a Person class:
//	public class Person {
//	    private String name;
//	    private int age;

	    // Constructor, getters, and setters
//	}

}
