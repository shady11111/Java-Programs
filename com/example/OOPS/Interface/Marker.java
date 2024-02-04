
package com.example.OOPS.Interface;

public class Marker {

	public static void main(String[] args) {
		MyClass object = new MyClass();

        if (object instanceof MarkerInterface) {
            System.out.println("object is an instance of Marker Interface.");
            // You can perform some special action because object implements the marker interface
        }
	}

}
interface MarkerInterface {
// This interface has no methods; it's a marker interface
//Custom Metadata: You can define your own marker interfaces to provide custom metadata or behavior to classes in your application.
}
class MyClass implements MarkerInterface {
    // Implementing the marker interface
}
