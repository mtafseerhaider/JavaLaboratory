package com.sprintqa.labs.lab02;

/**
 * @author Tafseer Haider
 * 10 Jun 2020
 */
public class LightDistanceCalculator
{

	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		// Step 2 - Initialize known values
		lightspeed = 186000;
		days = 100;
		
		// Step 3 - Get values for the unknown
		seconds = days * 24 * 60 * 60; // convert days into seconds
		
		// Step 4 – Implement your code logic
		distance = lightspeed * seconds; // compute distance
		
		// Step 5 – Output the program
		System.out.print ("In " + days);
		System.out.print (" days, light will travel about ");
		System.out.println (distance + " miles.");		
		
	}

}
