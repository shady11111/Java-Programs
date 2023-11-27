package com.example.FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\Codes\\New folder\\JavaExamples\\src\\com\\example\\FileHandling");
		f1.mkdir();
		System.out.println(f1.mkdir());
		f1.createNewFile();
		System.out.println(f1.createNewFile());
		System.out.println(f1.canExecute());
		System.out.println(f1.canWrite());
		System.out.println(f1.canRead());
		File f2=new File("D:\\Codes\\New folder\\JavaExamples\\src\\com\\example\\FileHandling\\File.text");
		System.out.println("Exists "+f1.exists());
		System.out.println(f2.renameTo(f1));
		System.out.println(f1.delete());
	}

}