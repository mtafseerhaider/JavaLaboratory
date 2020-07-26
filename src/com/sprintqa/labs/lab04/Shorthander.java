package com.sprintqa.labs.lab04;

/**
 * @author Tafseer Haider
 * 16 Jun 2020
 */
/*
 * Write a program to add 10 to 15 and assign it to sum variable. Using the shorthand operator add 5 to the sum. Now multiply
 * the sum with 12 and divide the sum with 2. Lastly take modulus of the sum with 100. The sample input and output of your
 * program should be:
 * 
 * Final sum is: 80
 */
public class Shorthander
{
	
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int num1, num2, num3, num4, num5, num6, sum;

		// Step 2 - Initialize known values
		num1 = 10;
		num2 = 15;
		num3 = 5;
		num4 = 12;
		num5 = 2;
		num6 = 100;

		// Step 3 - Get values for the unknown
		// will be calculated in step 4
		
		// Step 4 – Implement your code logic
		sum = num1 + num2;
		sum += num3;
		sum *= num4;
		sum /= num5;
		sum %= num6;

		// Step 5 – Output the program
		System.out.println ("Final sum is: " + sum);

	}

}
