package com.example.OOPS.InitBlocks;

import java.util.Scanner;

public class BookStore {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			Book b1 = BookCreator.receipt(scn);
			b1.display();
			Book b2 = BookCreator.receipt(scn);
			b2.display();
		}
	}

}

class Book {
	String author, title;
	double price;

	Book(String author, String title, double price) {
		this.author = author;
		this.title = title;
		this.price = price;
	}

	void display() {
		System.out.println("The book " + title + ", written by " + author + ", is priced at Rs." + price);
	}
}

class BookCreator {
	static Book receipt(Scanner scn) {
		// try (Scanner scn = new Scanner(System.in)) {
//The issue is that the Scanner object is closed when you exit the try block in the receipt() method. This is why you encountered the NoSuchElementException when you tried to reuse the Scanner.
//To handle this correctly within your original code, you should not close the Scanner object inside the receipt() method. Instead, you can create the Scanner in the main method and pass it as a parameter to the receipt() method. This way, you can reuse the same Scanner object without closing it prematurely.
//Closing a Scanner reading from System.in tends to cause that problem.
		System.out.println("Enter title:");
		String title = scn.nextLine();
		System.out.println("Enter author:");
		String author = scn.nextLine();
		System.out.println("Enter price:");
		double price = Double.parseDouble(scn.nextLine());
		Book b = new Book(author, title, price);
		return b;
		// }
	}

}
