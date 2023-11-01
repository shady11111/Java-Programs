package com.example.OOPS.Enum;

public class LaptopPrice {

	public static void main(String[] args) {
//		Laptop laptop=Laptop.MacBook;
//		System.out.println(laptop+" : "+laptop.getPrice());
		
		for(Laptop laptop:Laptop.values()) {
			if(laptop==Laptop.ThinkPad) {
				laptop.setPrice(900);
			}
			System.out.println(laptop+" : "+laptop.getPrice());
		}
	}
}
enum Laptop{
	MacBook(2000), XPS(2500), MacBookPro(2500),ThinkPad;
	
	private int price;
	private Laptop() {
		price=800;
	}
	
	private Laptop(int price) {
		this.price=price;
		System.out.println("executes separately for each enum constant at the time of enum class loading");
	}
	
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price=price;
	}
}