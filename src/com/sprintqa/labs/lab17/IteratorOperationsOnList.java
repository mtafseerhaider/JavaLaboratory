package com.sprintqa.labs.lab17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Tafseer Haider
 * 24/07/2020
 */
public class IteratorOperationsOnList
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

		// Creating an instance of Iterator
		Iterator<String> iterate = fruit.iterator();
		// Using the next() method
		String item = iterate.next();
		System.out.println("Accessed Element: " + item);
		// Using the remove() method
		iterate.remove();
		System.out.println("Removed Element: " + item);
		System.out.println (fruit);
		// Using the forEachRemaining() method
		iterate.forEachRemaining((value) -> System.out.print(value + ", "));

	}
}
