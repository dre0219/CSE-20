package org.xtext.example.mydsl;
import java.util.Scanner;
public class Number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
		double num = input.nextDouble();
		char num2;
		System.out.println("You have entered " + num);
		
		if (num >=0 && num <= 25) {
			num2 = (char)(num+65);
			System.out.print("The letter of the number you inserted is: " + num2);
		}
		else {
			System.out.print("Outside of acceptable range.");
		}
	}
}

