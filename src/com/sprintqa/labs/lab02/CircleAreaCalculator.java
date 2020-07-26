package com.sprintqa.labs.lab02;

/**
 * @author Tafseer Haider 10 Jun 2020
 */
public class CircleAreaCalculator
{

	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		double radius, pi, area;

		// Step 2 - Initialize known values
		radius = 10.8;
		
		// Step 3 - Get values for the unknown
		pi = 3.1416; // pi, approximately (also can be calculated as 22/7)

		// Step 4 – Implement your code logic
		area = pi * radius * radius; // compute area

		// Step 5 – Output the program
		System.out.println ("Area of the circle with radius " + radius + " = " + area);		

	}

}
