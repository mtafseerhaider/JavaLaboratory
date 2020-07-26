/**
 * 
 */
package com.sprintqa.labs.lab03;

import java.util.Scanner;

/**
 * @author Tafseer Haider 
 * 11 Jun 2020
 */
public class StringConcatenator
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		String firstname, middlename, lastname, fullname;

		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);

		// Step 3 - Get values for the unknown
		System.out.print ("Enter your firstname >>>");
		firstname = scanner.nextLine ();
		System.out.print ("Enter your middle name >>>");
		middlename = scanner.next ();
		System.out.print ("Enter your lastname >>>");
		lastname = scanner.next ();	 // get user input
		scanner.close ();   // close the scanner object

		// Step 4 – Implement your code logic
		fullname = firstname + " " + middlename + " " + lastname;  // concatenate both inputs

		// Step 5 – Output the program
		System.out.println ("My full name is: " + fullname);

	}

}
