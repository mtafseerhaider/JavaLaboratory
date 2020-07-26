/**
 * 
 */
package com.sprintqa.labs.lab04;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 16 Jun 2020
 */
/*
 * Write a Java program to find the number of days in a month and print it on console. Take February as 28 days. The sample input
 * and output of your program should be:
 * 
 * Enter month number: 6 June has 30 days
 */
public class DaysFinder
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int month, daysInMonth;
		String monthName;

		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);
		daysInMonth = 0;

		// Step 3 - Get values for the unknown
		System.out.println ("Enter month number:");
		month = scanner.nextInt ();
		scanner.close ();

		// Step 4 – Implement your code logic
		switch (month)
		{
			case 1:
				monthName = "January";
				daysInMonth = 31;
				break;
			case 2:
				monthName = "February";
				daysInMonth = 28;
				break;
			case 3:
				monthName = "March";
				daysInMonth = 31;
				break;
			case 4:
				monthName = "April";
				daysInMonth = 30;
				break;
			case 5:
				monthName = "May";
				daysInMonth = 31;
				break;
			case 6:
				monthName = "June";
				daysInMonth = 30;
				break;
			case 7:
				monthName = "July";
				daysInMonth = 31;
				break;
			case 8:
				monthName = "August";
				daysInMonth = 31;
				break;
			case 9:
				monthName = "September";
				daysInMonth = 30;
				break;
			case 10:
				monthName = "October";
				daysInMonth = 31;
				break;
			case 11:
				monthName = "November";
				daysInMonth = 30;
				break;
			case 12:
				monthName = "December";
				daysInMonth = 31;
				break;
			default:
				monthName = "Unknown";
				break;
		}

		// Step 5 - Output the program
		System.out.println (monthName + " has " + daysInMonth + " days.");

	}

}
