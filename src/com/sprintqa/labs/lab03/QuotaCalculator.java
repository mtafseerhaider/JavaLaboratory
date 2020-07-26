/**
 * 
 */
package com.sprintqa.labs.lab03;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 11 Jun 2020
 */
public class QuotaCalculator
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int sales, quota, salesShort;
		
		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);
		quota = 10;
		
		// Step 3 - Get values for the unknown
		System.out.println ("Enter the number of sales you made this week:");
		sales = scanner.nextInt ();
		scanner.close (); // close the scanner object

		// Step 4 – Implement your code logic and Output the program
		if (sales >= quota)
		{
		System.out.println ("Congrats! You've met your quota");
		}
		else
		{
		salesShort = quota - sales;
		System.out.println ("You did not make your quota. You were " + salesShort + " sales short");
		}
		
	}

}
