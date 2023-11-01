package com.example.OOPS.Coupling;

public class LooselyCoupled {

	public static void main(String[] args) {
		Motor carMotor = new CarMotor();
        Vehicle car = new Vehicle(carMotor);
        car.startMotor();

        Motor boatMotor = new BoatMotor();
        Vehicle boat = new Vehicle(boatMotor);
        boat.startMotor();
	}
}
interface Motor {
    void start();
}
class Vehicle {
	Motor motor;
    Vehicle(Motor motor) {
        this.motor = motor;
    }
    void startMotor() {
        motor.start();
    }
}
class CarMotor implements Motor {
    public void start() {
        System.out.println("Car engine started");
    }
}
class BoatMotor implements Motor {
    public void start() {
        System.out.println("Boat engine started");
    }
}