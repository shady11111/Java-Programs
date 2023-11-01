package com.example.OOPS.InitBlocks;

public class ClassLoader {

	public static void main(String[] args) throws ClassNotFoundException {
//static block executes when the class loads.
//Mobile class loads in the ClassLoader class, with Mobile object being created.
	  //new Mobile();
//However class can be still loaded, using class Class, 
		Class.forName("com.example.OOPS.InitBlocks.Mobile");
	}
	static {
		System.out.println("Static block of ClassLoader");
	}

}
class Mobile{
	String brand;
	int price;
	static String name;
	static {
		System.out.println("Static block of Mobile, to initialize staic variables.");
		name="Phone";
	}
	Mobile(){
		price=1000;
		brand="Nokia";
	}
	
	public void show() {
		System.out.println(brand + " : "+price +" : "+name);
	}
}
