package com.sprintqa.labs.lab15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 21/07/2020
 */
public class ExceptionHandlingProgram05
{
	public static void numbersExceptionHandling ()
	{
		File file = new File ("resources/numbers.txt");

		try (Scanner fileReader = new Scanner (file))
		{
			while (fileReader.hasNext ())
			{
				double num = fileReader.nextDouble ();
				System.out.println (num);
			}
		}
		catch (FileNotFoundException | InputMismatchException e)
		{
			e.printStackTrace ();
		}
	}

	public static void main (String[] args)
	{
		numbersExceptionHandling ();
	}
}
