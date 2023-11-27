package com.example.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\Codes\\New folder\\JavaExamples\\src\\com\\example\\FileHandling\\java.text");
		FileWriter fileWriter=new FileWriter(file);
		if(file.canWrite()) {
			fileWriter.write("ABCD\n");
			fileWriter.write("EFGH");
			System.out.println("written");
		}
		else {
			System.out.println("can't write");
		}
		fileWriter.close();
	}
}