package org.xtext.example.mydsl;
import java.util.Scanner;
public class ChooseFunc {

public static void main(String[] args) {

	System.out.println("This program supports 4 functions of a max number:");
	System.out.println("\t1. SumAll");
	System.out.println("\t2. SumSquare");
	System.out.println("\t3. Factorial");
	System.out.println("\t4. Fibonacci");

	Scanner input = new Scanner(System.in);

	while (true) {
		System.out.print("Please choose the function you want:");
		int func = input.nextInt(); // input

		System.out.print("Please enter the max number: ");
		int max = input.nextInt(); // input
		long[] resArr = new long [max+1]; 

		for (int i = 1; i <= max; i++) {
			if (func == 1) { // sumAll
				resArr[i] = resArr[i-1] + i; // adds 1 to index then subtracts it then adding the value
			} else if (func == 2) {
				resArr[i] = resArr[i-1] + i * i; // adds 1 to the index then subtracts it then adds the value * value
			} else if (func == 3) {
				if (i == 1) 
					resArr[i] = 1; // because 1*1 is just 1 
				else
						resArr[i] = resArr[i-1] * i; // Since the i is declared on the for loop it goes through each number that it has to multiply
			} else if (func == 4) {
				if (i == 1)
					resArr[i] = 1; // establish 1
				else 
					resArr[i] = resArr[i-2] + resArr[i-1]; // it grabs the index subtracts it and the result from that is the new i and u simply add both those numbers to get the value
			} else {
				System.out.println("Error: Do not know " + func);
				break;
			}
		}

		System.out.print("Do you wish to repeat inputs? (1 for yes): ");
		if (input.nextInt() == 1) {
			continue; // causes the loop to immediately jump to the next iteration of the loop
		}
		
		System.out.print("Do you wish to print out all the results? (1 for yes): ");
		if (input.nextInt() == 1) {
			System.out.println("Results in the array:");
			System.out.println("\tIndex\tValue");
			for (int i = 0; i <= max; i++) {
				System.out.println("\t" + i + "\t" + resArr[i]);
			}
				
		}

		System.out.print("Do you wish to end the program? (1 for yes): ");
		if (input.nextInt() == 1) {
			break;
		}
	}
}
}
