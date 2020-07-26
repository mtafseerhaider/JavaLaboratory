/**
 * 
 */
package com.sprintqa.labs.lab06;

import java.util.Arrays;

/**
 * @author Tafseer Haider
 * 23 Jun 2020
 */
public class ArraysSecondProgram
{
	public static void main (String[] args)
	{
		// Step 1 - Declare & Initialize the array
		String [] planets = {"Mercury", "Venus", "Earth", "Jupiter", "Saturn", "Uranus", "Neptune"};
		int LENGTH;

		// Step 2 - Initialize known values
		
		// Step 3 - Get values for the unknown
		LENGTH = planets.length;
		
		// Step 4 – Implement your code logic and output the program
		System.out.println ("Length of the planets array is: " + LENGTH);
		for (int i = 0; i < LENGTH; i++)
		{
			if (planets[i].equals ("Earth"))
			{
				System.out.println ("Earth is at " + i + " index");
			}
		}
		
	}
}
