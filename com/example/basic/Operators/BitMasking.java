package com.example.basic.Operators;

public class BitMasking {
	//Bit masking in Java involves using bitwise operators to manipulate individual bits within an integer or other integral data types.
	//Bit masking is often used in low-level programming, especially for tasks like setting or clearing specific flags within a binary representation.
	public static void main(String[] args) {
		int flags = 0;  // Initialize flags to 0
		        
		// Setting a bit (turning on a flag) using bitwise OR
		int flagToSet = 1;  // This corresponds to the first bit (2^0)
		flags |= flagToSet;  // Set the first bit
		        
		// Checking if a bit is set using bitwise AND
		int flagToCheck = 2;  // This corresponds to the second bit (2^1)
		boolean isSet = (flags & flagToCheck) != 0;  // Check if the second bit is set
		      
		// Clearing a bit (turning off a flag) using bitwise AND with a complement
		int flagToClear = 4;  // This corresponds to the third bit (2^2)
		flags &= ~flagToClear;  // Clear the third bit
		        
        System.out.println("Flags: " + Integer.toBinaryString(flags));
        System.out.println("Is the second bit set? " + isSet);
	}

}
