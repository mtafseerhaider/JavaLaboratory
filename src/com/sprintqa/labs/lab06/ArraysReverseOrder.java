/**
 * 
 */
package com.sprintqa.labs.lab06;

/**
 * @author Tafseer Haider
 * 23 Jun 2020
 */
public class ArraysReverseOrder
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int[] intArray = {1, 2, 3, 4, 5};
	
		// Step 2 - Initialize the max as the first element
	
		// Step 3 - Get values for the unknown
		// Original array
		System.out.println("Original array:");  
		for (int i = 0; i < intArray.length; i++)
		{
			 System.out.print(intArray[i] + " ");  
		}
		
		// Step 4 – Implement your code logic and output the program
		// Array in reverse order
		System.out.println();  
		System.out.println("Array in reverse order:");  
		for (int i = intArray.length - 1; i >= 0; i--)
		{
			 System.out.print(intArray[i] + " ");  
		}

	}
}
