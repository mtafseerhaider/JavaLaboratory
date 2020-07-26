package com.sprintqa.labs.lab15;

/**
 * @author Tafseer Haider
 * 21/07/2020
 */
public class ExceptionHandlingProgram01
{
	public static void main (String[] args)
	{
		try
		{
			int divideByZero = 5 / 0;
			System.out.println ("Rest of code in try block");
		}
		catch (ArithmeticException e)
		{
			System.out.println ("ArithmeticException => " + e.getMessage ());
		}

	}
}
