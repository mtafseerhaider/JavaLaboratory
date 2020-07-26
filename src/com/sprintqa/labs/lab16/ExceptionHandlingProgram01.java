package com.sprintqa.labs.lab16;

import java.io.File;
import java.io.IOException;

/**
 * @author Tafseer Haider
 * 21/07/2020
 */
public class ExceptionHandlingProgram01
{
	public static void createNewFile () throws IOException
	{
		File file = new File ("resources/nonexistentFile.txt");
		file.createNewFile ();
		System.out.println ("Throwing IOException....");
	}

	public static void main (String args[]) throws IOException
	{
		createNewFile ();
	}
}
