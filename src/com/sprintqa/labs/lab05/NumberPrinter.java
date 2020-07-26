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
 * Write a program that asks the user to input an integer and prints it until user enter 0 (zero). The sample input and output of
 * your program should be:
 * 
 * Enter your number: 5 You entered: 5 Enter your number: 0 You are out of loop because you entered: 0
 */
public class NumberPrinter
{

	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int num;

		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);
		
		// Step 3 - Get values for the unknown
		System.out.println ("Enter your number:");
		
		// Step 4 – Implement your code logic
		while ((num = scanner.nextInt ()) != 0)
		{
			System.out.println ("You entered: " + num);
			System.out.println ("Enter your number:");
		}

		// Step 5 - Output the program
		System.out.println ("You are out of loop because you entered: " + num);
		scanner.close ();
	}

}
