/**
 * 
 */
package com.sprintqa.labs.lab04;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 16 Jun 2020
 */
/*
 * Write a Java program to find a 2D shape when you input its sides. Do not print shapes with more than 10 sides. There is no shape
 * with 1 or sides so your program should print a message saying there is no shape with 1 or 2 sides. For reference, note the
 * following shapes with their sides. - 3 sides = Triangle - 4 sides = Square - 5 sides = Pentagon - 6 sides = Hexagon - 7 sides =
 * Heptagon - 8 sides = Octagon - 9 sides = Nonagon - 10 sides = Decagon
 * 
 * The sample input and output of your program should be:
 * 
 * Enter number of sides: 1 There is a No Shape with 1 sides
 */
public class ShapeFinder
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int numberOfSides;
		String shapeName;

		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);
		
		// Step 3 - Get values for the unknown
		System.out.println ("Enter number of sides:");
		numberOfSides = scanner.nextInt ();
		scanner.close ();

		// Step 4 – Implement your code logic
		switch (numberOfSides)
		{
			case 1:
			case 2:
				shapeName = "No Shape";
				break;
			case 3:
				shapeName = "Triangle";
				break;
			case 4:
				shapeName = "Square";
				break;
			case 5:
				shapeName = "Pentagon";
				break;
			case 6:
				shapeName = "Hexagon";
				break;
			case 7:
				shapeName = "Heptagon";
				break;
			case 8:
				shapeName = "Octagon";
				break;
			case 9:
				shapeName = "Nonagon";
				break;
			case 10:
				shapeName = "Decagon";
				break;
			default:
				shapeName = "Unknown";
				break;
		}

		// Step 5 - Output the program
		System.out.println ("There is a " + shapeName + " with " + numberOfSides + " sides");

	}

}
