package com.example.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo5 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file=new File("D:\\Codes\\New folder\\JavaExamples\\src\\com\\example\\FileHandling\\java.text");
		try(FileReader reader=new FileReader(file)){
			char[]characters=new char[(int)file.length()];
			reader.read(characters);
			for(char character:characters)
				System.out.println(character);
		}
	}
}