package com.sprintqa.labs.lab13;

/**
 * @author Tafseer Haider
 * 14/07/2020
 */
public class MonthConverter
{
	public static void main (String[] args)
	{
		Month month = new Month ();
		System.out.println ("Current Month Name is: " + month.getMonth (7));
		System.out.println ("Current Month Number is: " + month.getMonth ("July"));
	}
}
