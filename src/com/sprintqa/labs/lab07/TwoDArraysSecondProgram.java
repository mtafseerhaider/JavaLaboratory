/**
 * 
 */
package com.sprintqa.labs.lab07;

import java.util.Arrays;

/**
 * @author Tafseer Haider
 * 23 Jun 2020
 */
public class TwoDArraysSecondProgram
{
	public static void main (String[] args)
	{
		// Step 1 - Declare & Initialize the array
		int[][] array = {{ 1, 2, 3}, { 3, 4, 8}, { 5, 6, 7 }, { 8, 9, 3}};

		// Step 2 - Initialize known values
		// Step 3 - Get values for the unknown
		// in step 4

		// Step 4 – Implement your code logic & output the program
		for (int[] rows : array)
		{
			for (int column : rows)
			{
				System.out.print (column + " ");
			}

			System.out.println ();
		}

	}


}
