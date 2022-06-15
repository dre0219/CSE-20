package org.xtext.example.mydsl;
import java.util.Scanner;
public class BobCar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		int car, rntDays, clbmem, pckge, basePrice, num1, num2, num3;
		double totalPrice, num4, num5, estimate, estimate2;
		
		System.out.println("There are three types of cars Economy(1), Compact(2), and Standard(3).");
		 System.out.print("Please choose one of the following by using the numbers: ");
		 car = input.nextInt();
		 System.out.print("How many days will you rent the car for?: ");
		 rntDays = input.nextInt();
		 System.out.print("Are you a club member? 1 for yes, 0 for no: ");
		 clbmem = input.nextInt();

		 if (car == 1) { 
			 basePrice = 35;
			 totalPrice = rntDays * basePrice;
			 System.out.println("Price of car 1 without being a club member: " + totalPrice + "$");
			 if (clbmem == 1) {
				 System.out.print("Platinum Executive Package?: 1 for yes, 0 for no: ");
				 pckge = input.nextInt();
				 num1 = rntDays / 7;
				 num2 = num1 * basePrice;
				 num5 = totalPrice - num2;
				 System.out.println("Discount of the price is: -" + num2);
				 System.out.println("Total price of being a clubmember as well is: " + num5 + "$");
				 if (pckge == 1) {
					 num4 = (totalPrice * .15);
					 System.out.println("Price of car with Platinum Package is + " + num4 + "$");
					 estimate = totalPrice - num2 + num4;
					 System.out.print("The price of the car with the package as well as the club member discount is: " + estimate + "$");
							 
				 
				 }
			 }
		 }
	

	
	
if (car == 2) { 
	 basePrice = 45;
	 totalPrice = rntDays * basePrice;
	 System.out.println("Price of car 1 without being a club member: " + totalPrice + "$");
	 if (clbmem == 1) {
		 System.out.print("Platinum Executive Package?: 1 for yes, 0 for no: ");
		 pckge = input.nextInt();
		 num1 = rntDays / 7;
		 num2 = num1 * basePrice;
		 num5 = totalPrice - num2;
		 System.out.println("Discount of the price is: -" + num2);
		 System.out.println("Total price of being a clubmember as well is: " + num5 + "$");
		 if (pckge == 1) {
			 num4 = (totalPrice * .15);
			 System.out.println("Price of car with Platinum Package is + " + num4 + "$");
			 estimate = totalPrice - num2 + num4;
			 System.out.print("The price of the car with the package as well as the club member discount is: " + estimate + "$");
					 
		 
		 }
	 }
}



if (car == 3) { 
	 basePrice = 95;
	 totalPrice = rntDays * basePrice;
	 System.out.println("Price of car 1 without being a club member: " + totalPrice + "$");
	 if (clbmem == 1) {
		 System.out.print("Platinum Executive Package?: 1 for yes, 0 for no: ");
		 pckge = input.nextInt();
		 num1 = rntDays / 7;
		 num2 = num1 * basePrice;
		 num5 = totalPrice - num2;
		 System.out.println("Discount of the price is: -" + num2);
		 System.out.println("Total price of being a clubmember as well is: " + num5 + "$");
		 if (pckge == 1) {
			 num4 = (totalPrice * .15);
			 System.out.println("Price of car with Platinum Package is + " + num4 + "$");
			 estimate = totalPrice - num2 + num4;
			 System.out.print("The price of the car with the package as well as the club member discount is: " + estimate + "$");
					 
		 
		 }
	 }
}
}
}
