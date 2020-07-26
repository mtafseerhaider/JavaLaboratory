/**
 * 
 */
package com.sprintqa.labs.lab04;

/**
 * @author Tafseer Haider
 * 16 Jun 2020
 */
/*
 * Write a program to convert the double 15.65412145 into its byte, short, int and long variants. The sample input and output of
 * your program should be:
 * 
 * Number in byte: 15 Number in short: 15 Number in int: 15 Number in long: 15
 */
public class ExplicitCaster
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		double num;
		
		// Step 2 - Initialize known values
		num = 15.65412145;

		// Step 3 - Get values for the unknown
		// in step 4

		// Step 4 – Implement your code logic
		int numb = (byte) num;  // explicit type conversion
		int nums = (short) num;  // explicit type conversion
		int numi = (int) num;  // explicit type conversion
		long numl = (long) num;  // explicit type conversion
		
		

		// Step 5 - Output the program
		System.out.println ("Number in byte: " + numb);
		System.out.println ("Number in short: " + nums);
		System.out.println ("Number in int: " + numi);
		System.out.println ("Number in long: " + numl);
		
	}
}
