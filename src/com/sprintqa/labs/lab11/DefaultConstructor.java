package com.sprintqa.labs.lab11;

/**
 * @author Tafseer Haider
 * 07/07/2020
 */
public class DefaultConstructor
{
	float   floatNumber;
	boolean booleanValue;

	public static void main (String[] args)
	{
		// A default constructor is called
		DefaultConstructor object = new DefaultConstructor ();

		System.out.println ("floatNumber = " + object.floatNumber);
		System.out.println ("booleanValue = " + object.booleanValue);
	}
}
