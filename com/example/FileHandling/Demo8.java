package com.example.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo8 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream=new FileOutputStream("D:\\Codes\\New folder\\JavaExamples\\src\\com\\example\\FileHandling\\java.text");
		Student student1=new Student(29,"AB");
		
		try(ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream)){
			objectOutputStream.writeObject(student1);
			System.out.println(student1);
		}
	}
}

//Serialized data output:
//¬í sr  com.example.FileHandling.Student€hmqåÖ I ageL namet Ljava/lang/String;xp   t AB
//
//Here's a brief breakdown of the serialized data:
//
//¬í: Indicates that the stream is a Java Object Serialization Stream.
//sr: Represents a new Stream Protocol version.
//com.example.FileHandling.Student: The fully qualified class name of the serialized object.
//€h: The type of the object (a class description).
//m: Indicates a field in the object (likely "name" or "age").
//qåÖ: Binary data representing the serialized field value.
//: Indicates the end of the field value.
//I: Indicates an integer field.
//age: The name of the field ("age").
//L: Indicates that the field is an object (not primitive).
//name: The name of the field ("name").
//t: Indicates the start of a new object (possibly the String "AB" in this case).
//AB: Binary data representing the serialized String "AB".