package com.sprintqa.labs.lab02;

/**
 * @author Tafseer Haider
 * 10 Jun 2020
 */
public class ArithmeticOperators
{

	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int num1, num2, num3, num4, num5, result;

		// Step 2 - Initialize known values
		num1 = 12;
		num2 = 2223;
		num3 = 3;
		num4 = 7;
		num5 = 5;

		// Step 3 - Get values for the unknown
		// only result is unknown which needs to be computed in step 4

		// Step 4 – Implement your code logic
		result = ((((num1 + num2) / num3)) % num4) * num5; // compute the final result

		// Step 5 – Output the program
		System.out.println ("Final Result: " + result);
	}

}
