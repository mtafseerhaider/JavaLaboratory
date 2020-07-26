package com.sprintqa.labs.lab06;

/**
 * @author Tafseer Haider
 * 23 Jun 2020
 */
public class ArraysLargestElement
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int[] intArray = {5, 15, 20, 25, 30, 35, 40};
		int MIN;
		int MAX;

		// Step 2 - Initialize the max as the first element
		MIN = intArray[0];
		MAX = intArray[0];

		// Step 3 - Get values for the unknown
		// in step 4
		
		// Step 4 – Implement your code logic
		for (int i = 0; i < intArray.length; i++)
		{
			// Compare each element of array with MIN
			if (intArray[i] < MIN)
			{
				MIN = intArray[i];
			}
			// Compare each element of array with MAX
			if (intArray[i] > MAX)
			{
				MAX = intArray[i];
			}
		}

		// Step 5 - Output the program
		System.out.println("The smallest element present in the given array is: " + MIN);  
		System.out.println("The largest element present in the given array is: " + MAX);  

	}
}
