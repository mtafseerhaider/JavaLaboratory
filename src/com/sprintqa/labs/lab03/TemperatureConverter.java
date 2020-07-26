/**
 * 
 */
package com.sprintqa.labs.lab03;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 11 Jun 2020
 */
public class TemperatureConverter
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		float Fahrenheit, Celsius;

		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);

		// Step 3 - Get values for the unknown
		System.out.print ("Enter Temperature in Fahrenheit >>>");
		Fahrenheit = scanner.nextFloat (); // get user input
		scanner.close ();   // close the scanner object

		// Step 4 – Implement your code logic
		Celsius = (Fahrenheit - 32) * 5 / 9; // compute temperature in Celsius

		// Step 5 – Output the program
		System.out.println (Fahrenheit + " Fahrenheit in Celsius is: " + Celsius);
		
	}

}
