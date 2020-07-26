package com.sprintqa.labs.lab11;

/**
 * @author Tafseer Haider
 * 07/07/2020
 */
public class Number
{
	int number;

	// constructor with no parameter
	private Number ()
	{
		number = 10;
		System.out.println ("Object created and number = " + number);
	}

	public static void main (String[] args)
	{
		// calling the constructor without any parameter
		Number object = new Number ();
	}
}
