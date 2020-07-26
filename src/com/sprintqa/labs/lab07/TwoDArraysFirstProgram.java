/**
 * 
 */
package com.sprintqa.labs.lab07;

/**
 * @author Tafseer Haider
 * 23 Jun 2020
 */
public class TwoDArraysFirstProgram
{
	public static void main (String[] args)
	{
		// Step 1 - Declare & Initialize the array
		int[][] array = {{ 1, 2, 3}, { 3, 4, 8}, { 5, 6, 7 }, { 8, 9, 3}};

		// Step 2 - Initialize known values
		// Step 3 - Get values for the unknown
		// in step 4

		// Step 4 – Implement your code logic & output the program
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				System.out.print (array[i][j] + " ");
			}

			System.out.println ();
		}

	}

}
