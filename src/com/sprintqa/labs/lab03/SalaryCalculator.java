/**
 * 
 */
package com.sprintqa.labs.lab03;

import java.util.Scanner;

/**
 * @author Tafseer Haider 
 * 11 Jun 2020
 */
public class SalaryCalculator
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		double salary, bonus;
		int sales, quota;
		
		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);
		salary = 700;
		bonus = 300;
		quota = 10;
		
		// Step 3 - Get values for the unknown
		System.out.println ("How many sales did the employee make this week?");
		sales = scanner.nextInt();
		scanner.close (); // close the scanner object
		
		// Step 4 – Implement your code logic
		if (sales > quota)
		{
		salary = salary + bonus;
		}
		
		// Step 5 – Output the program
		System.out.println("The employee's pay is $" + salary);
	}

}
