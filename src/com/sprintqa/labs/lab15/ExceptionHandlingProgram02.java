package com.sprintqa.labs.lab15;

/**
 * @author Tafseer Haider
 * 21/07/2020
 */
public class ExceptionHandlingProgram02
{
	int[] arrayOfNumbers = new int[10];

	public void addElements ()
	{
		try
		{
			arrayOfNumbers[10] = 11;
		}
		catch (NumberFormatException e1)
		{
			System.out.println ("NumberFormatException => " + e1.getMessage ());
		}
		catch (IndexOutOfBoundsException e2)
		{
			System.out.println ("IndexOutOfBoundsException => " + e2.getMessage ());
		}

	}

	public static void main (String[] args)
	{
		ExceptionHandlingProgram02 list = new ExceptionHandlingProgram02 ();
		list.addElements ();
	}
}
