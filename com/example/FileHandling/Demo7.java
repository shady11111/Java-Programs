package com.example.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo7 {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter=new FileWriter("D:\\Codes\\New folder\\JavaExamples\\src\\com\\example\\FileHandling\\java.text");
		try(BufferedWriter bufferReader=new BufferedWriter(fileWriter)){
			bufferReader.write("ABCD");
			bufferReader.newLine();
			bufferReader.write("EFGH");
		}
	}
}