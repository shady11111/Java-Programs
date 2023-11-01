package com.example.OOPS.UpDownCast;

public class TypeComparision2 {

	public static void main(String[] args) {
		AirVehicle airVehicle = new Chopper();

        if (airVehicle instanceof AirVehicle) {
            System.out.println("This is a AirVehicle");
        }

        if (airVehicle instanceof Chopper) {
            System.out.println("This is a Chopper");
        }
        
        Object truck=new Truck();
        System.out.println(truck instanceof AirVehicle);
        System.out.println(truck instanceof Chopper);
        
        Object chopper=new Chopper();
        System.out.println(chopper instanceof AirVehicle);
	}
}
interface AirVehicle {
    void drive();
}

class Chopper implements AirVehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}
class Truck{
	
}