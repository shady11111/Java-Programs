package com.example.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo6 {

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("D:\\Codes\\New folder\\JavaExamples\\src\\com\\example\\FileHandling\\java.text");
		BufferedReader bufferReader=new BufferedReader(fileReader);
		String string=bufferReader.readLine();
		while(string!=null){
			System.out.println(string);
			string=bufferReader.readLine();
		}
		bufferReader.close();
	}

}