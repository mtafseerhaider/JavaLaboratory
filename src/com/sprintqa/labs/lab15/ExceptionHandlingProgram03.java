package com.sprintqa.labs.lab15;

import java.io.File;
import java.io.IOException;

/**
 * @author Tafseer Haider
 * 21/07/2020
 */
public class ExceptionHandlingProgram03
{
	public static void createNewFile ()
	{
		File file = new File ("resources/nonexistentFile.txt");
		try
		{
			file.createNewFile ();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main (String args[])
	{
		createNewFile ();
	}
}
