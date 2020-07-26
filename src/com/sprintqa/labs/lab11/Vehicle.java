package com.sprintqa.labs.lab11;

/**
 * @author Tafseer Haider
 * 07/07/2020
 */
public class Vehicle
{
	int wheels;

	// constructor accepting single value
	private Vehicle (int wheels)
	{
		System.out.println (wheels + " wheeler vehicle created.");
	}

	public static void main (String[] args)
	{
		// calling the constructor by passing single value
		Vehicle v1 = new Vehicle (2);
		Vehicle v2 = new Vehicle (4);
	}
}
