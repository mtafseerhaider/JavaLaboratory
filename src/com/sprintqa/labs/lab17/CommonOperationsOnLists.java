package com.sprintqa.labs.lab17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Tafseer Haider
 * 24/07/2020
 */
public class CommonOperationsOnLists
{
	public static void main (String[] args)
	{
		List<String> animals = new ArrayList ();

		// Using the add() method
		animals.add ("Horse");

		// Using index number
		animals.add (0, "Dog");
		animals.add (1, "Cat");
		System.out.println ("ArrayList: " + animals);

		// Using get() Method
		System.out.println (animals.get (0));

		// Using set() Method
		// Change the element of the array list
		animals.set (2, "Zebra");
		System.out.println ("Modified ArrayList: " + animals);

		// Using contains() method
		System.out.println (animals.contains ("Dog"));

		// Sort Elements of an ArrayList
		// Sort the array list
		Collections.sort (animals);
		System.out.println ("Sorted ArrayList: " + animals);
		Collections.sort (animals, Collections.reverseOrder ());
		System.out.println ("Sorted in reverse ArrayList: " + animals);

		// Shuffle Elements of an ArrayList
		Collections.shuffle (animals);
		System.out.println ("Shuffled ArrayList: " + animals);

		// Convert ArrayList to an Array
		String[] array = new String[animals.size ()];

		// Convert ArrayList into an array
		animals.toArray (array);
		System.out.print ("Array: ");
		for (String item : array)
		{
			System.out.print (item + ", ");
		}

		// Convert array to ArrayList
		List<String> animals2= new ArrayList(Arrays.asList(array));
		System.out.println("\nArrayList: " + animals2);

	}
}
