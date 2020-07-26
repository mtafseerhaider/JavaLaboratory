package com.sprintqa.labs.lab06;

import java.util.Arrays;

/**
 * @author Tafseer Haider
 * 23 Jun 2020
 */
public class ArraysThirdProgram
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int LENGTH,  naturalNumbers[];

		// Step 2 - Initialize known values
		LENGTH = 20;
		naturalNumbers = new int [LENGTH];

		// Step 3 - Get values for the unknown
		// in step 4
		
		// Step 4 – Implement your code logic and output the program
		for (int i = 0; i < LENGTH; i++)
		{
			naturalNumbers[i] = i + 1;
			System.out.print (naturalNumbers[i] + " ");
		}

	}

}
