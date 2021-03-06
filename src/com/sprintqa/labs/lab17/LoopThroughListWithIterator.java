package com.sprintqa.labs.lab17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Tafseer Haider
 * 24/07/2020
 */
public class LoopThroughListWithIterator
{
	public static void main (String[] args)
	{
		List<String> fruit = new ArrayList ();
		fruit.add ("apple");
		fruit.add ("mango");
		fruit.add ("banana");
		fruit.add ("orange");
		fruit.add ("watermelon");
		fruit.add ("pineapple");
		fruit.add ("lemon");

		Iterator i = fruit.iterator();
		while (i.hasNext ())
		{
			System.out.println (i.next ());
		}
	}
}
