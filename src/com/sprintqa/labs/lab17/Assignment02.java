package com.sprintqa.labs.lab17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Tafseer Haider
 * 24/07/2020
 */
public class Assignment02
{
	public static void main (String[] args)
	{
		List<String> colors = new ArrayList ();
		colors.add ("White");
		colors.add ("Black");
		colors.add ("Red");
		colors.add ("Green");
		colors.add ("Blue");

		Iterator i = colors.listIterator ();
		while (i.hasNext ())
		{
			System.out.println (i.next ());
		}

	}
}
