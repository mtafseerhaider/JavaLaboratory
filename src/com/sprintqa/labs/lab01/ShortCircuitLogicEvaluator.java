/**
 * 
 */
package com.sprintqa.labs.lab01;

/**
 * @author Tafseer Haider
 * 10 Jun 2020
 */
public class ShortCircuitLogicEvaluator
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int a, b;

		// Step 2 - Initialize known values
		a = 50;
		b = 60;

		// Step 3 - Get values for the unknown
		// unknown value needs to be computed in step 4

		// Step 4 – Implement your code logic
		System.out.println (a < 40 || a < b); // check short-circuit logic

		// Step 5 – Output the program
		// output in step 4

	}

}
