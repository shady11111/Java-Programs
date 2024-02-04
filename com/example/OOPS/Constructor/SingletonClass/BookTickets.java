package com.example.OOPS.Constructor.SingletonClass;

import java.util.Scanner;

public class BookTickets {

	public static void main(String[] args) {
		//TicketBookingApp.bookTickets();
//When you close the Scanner using a try-with-resources statement, it also closes the underlying System.in, and you can't reopen it.
//and hence java.util.NoSuchElementException occurs, when tried to use it the second time.
		//TicketBookingApp.bookTickets();
		//to resolve this, let's use Scanner class with try resource block in the main method, instead in the bookTickets.
		try (Scanner scanner = new Scanner(System.in)) {
			TicketBookingApp.bookTickets(scanner);
			TicketBookingApp.bookTickets(scanner);
		}
		
	}
}
class MovieHall{
	int seats=50;
	private static MovieHall movieHallObject=null;
	private MovieHall() {
	}
	public static MovieHall getMovieHallObject(){
		if(movieHallObject==null)movieHallObject=new MovieHall();
		return movieHallObject;
	}
	void reserveTickets(int numberOfSeats) {
		if(numberOfSeats>seats) {
			if(seats==0) {
				System.out.println("Houseful");
				return;
			}
			System.out.println("Remaining seats are "+seats);
			return;
		}
		System.out.println(numberOfSeats+" seats are reserved");
		seats-=numberOfSeats;
	}
}
class TicketBookingApp{
//	static void bookTickets() {
//		try (Scanner scanner = new Scanner(System.in)) {
//			System.out.println("Enter number of tickets:");
//			int tickets=scanner.nextInt();
//			MovieHall movieHallObject=MovieHall.getMovieHallObject();
//			movieHallObject.reserveTickets(tickets);
//		}
//	}
	static void bookTickets(Scanner scanner) {
			System.out.println("Enter number of tickets:");
			int tickets=scanner.nextInt();
			MovieHall movieHallObject=MovieHall.getMovieHallObject();
			movieHallObject.reserveTickets(tickets);
	}
}