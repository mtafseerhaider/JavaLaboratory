/**
 * 
 */
package com.sprintqa.labs.lab01;

/**
 * @author Tafseer Haider
 * 10 Jun 2020
 */
public class Absolutor
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int number, absolute;

		// Step 2 - Initialize known values
		number = -10;
		
		// Step 3 - Get values for the unknown
		// unknown value needs to be computed in step 4

		// Step 4 – Implement your code logic
		absolute = number < 0 ? -number : number; // evaluate the absolute value

		// Step 5 – Output the program
		System.out.print ("Absolute value of ");
		System.out.println (number + " is " + absolute);

	}

}
