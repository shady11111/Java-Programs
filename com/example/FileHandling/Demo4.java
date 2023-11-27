package com.example.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream fileOutputStream=new FileInputStream("D:\\Codes\\New folder\\JavaExamples\\src\\com\\example\\FileHandling\\java.text")){
			int n=fileOutputStream.read();
			while(n!=-1) {
				System.out.println((char)n);
				n=fileOutputStream.read();
			}
		}
	}
}