package com.example.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\Codes\\New folder\\JavaExamples\\src\\com\\example\\FileHandling\\java.text");
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		if(file.canWrite()) {
			String s="ABCD\n";
			byte[] b=s.getBytes();
			fileOutputStream.write(b);
		}
		else {
			System.out.println("can't write");
		}
		fileOutputStream.close();
	}
}