package com.example.FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo9 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream=new FileInputStream("D:\\Codes\\New folder\\JavaExamples\\src\\com\\example\\FileHandling\\java.text");
		try(ObjectInputStream objectOutputStream=new ObjectInputStream(fileInputStream)){
			Student student=(Student)objectOutputStream.readObject();
			
			System.out.println("Deserialized Student: " + student);
            System.out.println("Student's Name: " + student.name);
            System.out.println("Student's Age: " + student.age);
		}
	}
}