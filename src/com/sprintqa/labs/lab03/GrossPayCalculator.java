/**
 * 
 */
package com.sprintqa.labs.lab03;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 11 Jun 2020
 */
public class GrossPayCalculator
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int hours;
		double grossPay, rate;

		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);
		
		// Step 3 - Get values for the unknown
		System.out.print ("Enter the number of hours you worked. >>>");
		hours = scanner.nextInt();
		System.out.print ("Enter your pay rate. >>>");
		rate = scanner.nextDouble();
		scanner.close (); // close the scanner object

		// Step 4 – Implement your code logic
	     grossPay = hours * rate; // compute gross pay

		// Step 5 – Output the program
	     System.out.println("Your gross pay is: " + "$" + grossPay);
	}

}
