package com.sprintqa.labs.lab12;

/**
 * @author Tafseer Haider
 * 09/07/2020
 */
public class ColorTester
{
	static String [] colorPalette = {"white", "black", "red", "green", "blue", "orange", "yellow"};

	static void displayColors ()
	{
		System.out.print ("Color Palette: ");
		for (String color : colorPalette)
		{
			System.out.print (color + " ");
		}
	}

	public static void main (String[] args)
	{
		displayColors ();
	}
}
