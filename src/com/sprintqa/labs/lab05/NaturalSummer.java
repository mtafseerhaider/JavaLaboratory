/**
 * 
 */
package com.sprintqa.labs.lab05;

/**
 * @author Tafseer Haider
 * 17 Jun 2020
 */
/*
 * Write a program to find the sum of first 100 natural numbers. The output of your program should be:
 * 
 * Sum of 1st 100 natural numbers is: 5050
 */
public class NaturalSummer
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int sum, sentinel;

		// Step 2 - Initialize known values
		sum = 0;
		sentinel = 100;

		// Step 3 - Get values for the unknown
		// in step 4

		// Step 4 – Implement your code logic
		while (sentinel != 0)
		{
			sum += sentinel; // sum = sum + sentinel
			--sentinel;
		}

		// Step 5 - Output the program
		System.out.println ("Sum of 1st 100 natural numbers is: " + sum);
		
	}

}
