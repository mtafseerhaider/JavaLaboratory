package com.sprintqa.labs.lab16;

/**
 * @author Tafseer Haider
 * 21/07/2020
 */
public class ExceptionHandlingProgram02
{
	public static void divideByZero ()
	{
		int divideByZero = 5 / 0;
		throw new ArithmeticException ("Trying to divide by 0");
	}

	public static void main (String[] args)
	{
		try
		{
			divideByZero ();
		}
		catch (ArithmeticException e)
		{
			System.out.println ("Dividing by zero is not permitted");
		}
		finally
		{
			System.out.println ("Division is fun!");
		}

	}
}
