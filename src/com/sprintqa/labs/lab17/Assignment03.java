package com.sprintqa.labs.lab17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Tafseer Haider
 * 25/07/2020
 */
public class Assignment03
{
	public static void main (String[] args)
	{
		List<Integer> numbers = new ArrayList ();
		for (int i = 1; i <= 10; i++)
		{
           numbers.add (i);
		}

		System.out.println ("List before sorting: " + numbers);
		Collections.sort (numbers, Collections.reverseOrder ());
		System.out.println ("List sorted in descending order: " + numbers);

		if (numbers.contains (5))
		{
			System.out.println ("Found");
		}
		else
			System.out.println ("Not Found");
	}

}
