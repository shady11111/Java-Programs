package com.example.OOPS.Exception;

public class Demo5 {
	public static void main(String[] args) {
		int i=20;
		int j=0;
		
		try {
			j=18/i;
			if(j==0)
				throw new OwnException("don't want to print zero"); //parameterized constructor
		}
		catch(OwnException e){
			j=18/1;
			System.out.println("let the default output be "+j+", 'cause "+e);
		}
		System.out.println(j);
	}
}

@SuppressWarnings("serial")
class OwnException extends Exception{
	
//when a class is created that implements the Serializable interface (including indirectly through inheritance),
//it is recommended to include a serialVersionUID field to provide versioning control for your class.
//The serialVersionUID is a unique identifier for the class version
//and is used during deserialization to ensure that the sender and receiver of a serialized object
//have loaded classes for that object that are compatible with respect to serialization.
	
	//private static final long serialVersionUID = 123456789L;
	
	OwnException(String message){
		super(message);
	}
}