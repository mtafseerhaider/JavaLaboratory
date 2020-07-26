/**
 * 
 */
package com.sprintqa.labs.lab04;

/**
 * @author Tafseer Haider
 * 16 Jun 2020
 */
/*
 * Write a program to convert integer 200 into its long, float and double variants. The sample input and output of your program
 * should be:
 * 
 * Number in long: 200 Number in float: 200.0 Number in double: 200.0
 */
public class ImplicitCaster
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int num;
		
		// Step 2 - Initialize known values
		num = 200;

		// Step 3 - Get values for the unknown
		// in step 4

		// Step 4 – Implement your code logic
		long numl = num;  // automatic type conversion
		float numf = num; // automatic type conversion
		float numd = num; // automatic type conversion
		

		// Step 5 - Output the program
		System.out.println ("Number in long: " + numl);
		System.out.println ("Number in float: " + numf);
		System.out.println ("Number in double: " + numd);
		
	}
}
