package org.xtext.example.mydsl;

import java.util.Scanner;

public class AnyAverageArr {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program will find the average of any number.");
		System.out.print("Please choose amount of numbers to average:");

		int max = input.nextInt(); // input 

		int[]arr1 = new int[max]; // sets as max

		int i = 0;
		int sum = 0;

		for (i = 0; i < max; i++) {
			System.out.print("Please enter " + i + " number: "); // starting from zero it prints out each individual number 
			int number = input.nextInt(); // the input for that number
			arr1[i] = number; // the input from the number 
			sum += arr1[i]; // sum + arr1
		}

		System.out.print("The numbers being averaged:");

		for (i = 0; i < max; i++) {
			if (i % 5 == 0){
				System.out.println();
				System.out.print(arr1[i] + " "); //prints the first number of the input
			}
			else {
				System.out.print(arr1[i] + " "); // all the numbers are printed after the first one
			}
		}
		System.out.println();
		System.out.print("Average is: " + sum/max); // how the average is made
	}	
}
