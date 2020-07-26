/**
 * 
 */
package com.sprintqa.labs.lab06;

/**
 * @author Tafseer Haider
 * 23 Jun 2020
 */
public class EvenPositionElements
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int[] intArray = {2, 22, 222, 2222, 22222};
	
		// Step 2 - Initialize the max as the first element
	
		// Step 3 - Get values for the unknown
				
		// Step 4 – Implement your code logic and output the program
		// Elements at even positions
		System.out.println("Elements at even positions:");  
		for (int i = 1; i < intArray.length; i = i + 2)
		{
			 System.out.print(intArray[i] + " ");  
		}

	}
}
