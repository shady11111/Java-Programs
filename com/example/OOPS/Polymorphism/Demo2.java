package com.example.OOPS.Polymorphism;

public class Demo2 {

	public static void main(String[] args) {
		Rider rider=new Rider();
		Rider proRider=new ProRider();
		Bike bikeKTM=new KTM();
		KTM ktm=new KTM();
//if ride(Bike bike) of Rider is commented out gives compilation error for rider.ride(bikeKTM);
		rider.ride(bikeKTM);//Rider rides bike
//both overridden method (chooses based on object) and overloaded argument (chosen by the compiler)
		proRider.ride(ktm);//Rider rides KTM
		rider.ride(ktm);//Rider rides KTM
		proRider.ride(bikeKTM);//Pro-Rider rides bike
	}
}
class Bike{	
}
class KTM extends Bike{	
}
class Rider{
	void ride(Bike bike) {
		System.out.println("Rider rides bike");
	}
	void ride(KTM bike) {
		System.out.println("Rider rides KTM");
	}
}
class ProRider extends Rider{
	void ride(Bike bike) {
		System.out.println("Pro-Rider rides bike");
	}
}