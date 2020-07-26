/**
 * 
 */
package com.sprintqa.labs.lab05;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 17 Jun 2020
 */
/*
 * Each store employee makes $15 an hour. Maximum hours allowed are 40. Write a program that allows the employee to enter the number
 * of hours worked for the week and calculate its gross pay. Do not allow overtime and if user enters more than 40 hours then ask
 * the user to try again. You program must not close when you ask user to try again. The sample input and output of your program
 * should be:
 * 
 * How many hours did you work this week? 41 Invalid entry. Your hours must be between 1 and 40. Try again. 40 Your gross pay:
 * $600.0
 */
public class GrossPayValidator
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int rate, maxHours;
		double hoursWorked, grossPay;

		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);
		rate = 15;
		maxHours = 40;

		// Step 3 - Get values for the unknown
		System.out.println("How many hours did you work this week?");
		hoursWorked = scanner.nextDouble();
		
		// Step 4 – Implement your code logic
		while (hoursWorked > maxHours)
		{
			System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
		}
		
		scanner.close ();
		
		// Calculate gross pay
		grossPay = rate * hoursWorked;

		// Step 5 - Output the program
		System.out.println("Your gross pay: $" + grossPay);		

	}

}
