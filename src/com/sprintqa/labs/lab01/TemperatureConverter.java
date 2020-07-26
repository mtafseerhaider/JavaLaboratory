/**
 * 
 */
package com.sprintqa.labs.lab01;

/**
 * @author Tafseer Haider
 * 10 Jun 2020
 */
public class TemperatureConverter
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		float Fahrenheit, Celsius;

		// Step 2 - Initialize known values
		Fahrenheit = 200f;

		// Step 3 - Get values for the unknown
		// unknown value needs to be computed in step 4

		// Step 4 – Implement your code logic
		Celsius  = (Fahrenheit - 32) * 5 / 9;   // compute temperature in Celsius

		// Step 5 – Output the program
		System.out.println(Fahrenheit + " Fahrenheit in Celsius is: " + Celsius);  

	}

}
