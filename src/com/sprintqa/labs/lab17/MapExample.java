package com.sprintqa.labs.lab17;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tafseer Haider
 * 24/07/2020
 */
public class MapExample
{
	public static void main (String[] args)
	{
		Map fruitCalories = new HashMap ();
		fruitCalories.put ("apple", 52);
		fruitCalories.put ("banana", 89);
		fruitCalories.put ("mango", 60);
		fruitCalories.put ("orange", 47);

		System.out.println (fruitCalories.size ());
		System.out.println (fruitCalories);
		System.out.println ("Calories in 100 grams of banana: " + fruitCalories.get ("banana"));
		System.out.println (fruitCalories.entrySet ()); // returns Set that contains entries in the map

	}
}
