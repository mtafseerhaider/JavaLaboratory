package com.sprintqa.labs.lab16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 21/07/2020
 */
public class ExceptionHandlingProgram03
{
	public static void numbersExceptionHandling() throws FileNotFoundException
	{
		File file = new File ("resources/numbers.txt");
		Scanner fileReader = new Scanner (file);

		while (fileReader.hasNext ())
		{
			int num = fileReader.nextInt ();
			System.out.println (num);
		}
	}

	public static void main (String[] args) throws FileNotFoundException
	{
		numbersExceptionHandling ();
	}
}
