/**
 * 
 */
package com.sprintqa.labs.lab03;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 11 Jun 2020
 */
public class NumberSignChecker
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int number;

		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);
		
		// Step 3 - Get values for the unknown
		System.out.print("Enter any number: ");
		number = scanner.nextInt ();
		scanner.close (); // close the scanner object

		// Step 4 – Implement your code logic and Output the program
		if (number > 0)
        {
            System.out.println("Number is positive");
        }
        else if (number < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
		

	}

}
