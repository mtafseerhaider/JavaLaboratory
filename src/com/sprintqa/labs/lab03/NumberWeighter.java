/**
 * 
 */
package com.sprintqa.labs.lab03;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 11 Jun 2020
 */
public class NumberWeighter
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int num1, num2, num3;

		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);

		// Step 3 - Get values for the unknown
		System.out.print("Enter the 1st number: ");
		num1 = scanner.nextInt ();
		System.out.print("Enter the 2nd number: ");
		num2 = scanner.nextInt ();
		System.out.print("Enter the 3rd number: ");
		num3 = scanner.nextInt ();
		scanner.close (); // close the scanner object

		// Step 4 – Implement your code logic and Output the program
		if (num1 > num2)
			if (num1 > num3)
				System.out.println ("The greatest number is: " + num1);

		if (num2 > num1)
			if (num2 > num3)
				System.out.println ("The greatest number is: " + num2);

		if (num3 > num1)
			if (num3 > num2)
				System.out.println ("The greatest number is: " + num3);

	}

}
