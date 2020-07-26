/**
 * 
 */
package com.sprintqa.labs.lab03;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 11 Jun 2020
 */
public class LoanQualifier
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		double currentSalary, requiredSalary;
		int currentYears, requiredYearsEmployed;

		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);
		requiredSalary = 30000;
		requiredYearsEmployed = 2;

		// Step 3 - Get values for the unknown
		System.out.println("Enter your current salary:");
		currentSalary = scanner.nextDouble();
		System.out.println("Enter the number of years with your current employer:");
		currentYears = scanner.nextInt ();
		scanner.close (); // close the scanner object

		// Step 4 – Implement your code logic and Output the program
		if (currentSalary >= requiredSalary)
		{
			if (currentYears >= requiredYearsEmployed)
			{
				System.out.println ("Congrats! You qualify for the loan");
			}
			else
			{
				System.out.println ("Sorry, you must have worked at your current job " + requiredYearsEmployed + " years.");
			}
		}
		else
		{
			System.out.println ("Sorry, you must earn at least $" + requiredSalary + " to qualify for the loan");
		}

	}

}
