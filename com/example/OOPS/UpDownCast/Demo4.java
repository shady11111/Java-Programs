package com.example.OOPS.UpDownCast;

public class Demo4 {

	public static void main(String[] args) {
		Drive d = new Drive();
		d.drive(new Harley_Davidson());
	}

}

class Bike {
	void starts() {
	}

	void accelerates() {
	}

	void stops() {
	}
}

class Harley_Davidson extends Bike {
	@Override
	void starts() {
		System.out.println("Harley Davidson starts");
	}

	@Override
	void accelerates() {
		System.out.println("Harley Davidson accelerates");
	}

	@Override
	void stops() {
		System.out.println("Harley Davidson stops");
	}
}

class Drive {
	void drive(Bike b) {
//upcasted, searches the methods in Bike class, and then goes to overridden methods,
//so mandate to have these methods in Bike class as well,
//because accesses the common methods and Bike reference can only see the overridden methods.
		b.starts();
		b.accelerates();
		b.stops();
	}
}