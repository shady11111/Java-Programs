package com.example.basic.recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.print("Enter the number of disks: ");
			int number = scn.nextInt();
			System.out.println("Solving Tower of Hanoi for " + number + " disks...\n");
			moveDisk(number,'A','C','B');
			System.out.println("\nTower of Hanoi solved!");
		}
	}
	private static void moveDisk(int number,char source, char destination, char auxillary) {
		if(number==1) {
			System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return;
		}
		moveDisk(number-1,source,auxillary,destination);
		System.out.println("Move disk " + number + " from rod " + source + " to rod " + destination);
		moveDisk(number-1, auxillary, destination, source);		
	}

}
