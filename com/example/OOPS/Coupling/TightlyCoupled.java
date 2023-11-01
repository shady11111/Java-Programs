package com.example.OOPS.Coupling;

public class TightlyCoupled {

	public static void main(String[] args) {
		VintageCar vintageCar = new VintageCar();
    	vintageCar.startEngine(); // Calls the Car class method
	}
}
class Automobile {
    void startEngine() {
        System.out.println("Vehicle engine started");
    }
}

class VintageCar extends Automobile {
    void startEngine() {
        System.out.println("Car engine started");
    }
}