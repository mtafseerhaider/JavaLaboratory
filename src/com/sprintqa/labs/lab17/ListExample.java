package com.sprintqa.labs.lab17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Tafseer Haider
 * 24/07/2020
 */
public class ListExample
{
	public static void main (String[] args)
	{
		List fruit = new ArrayList ();
		fruit.add ("apple");
		fruit.add ("mango");
		fruit.add ("banana");
		fruit.add ("orange");
		fruit.add ("watermelon");
		fruit.add ("pineapple");
		fruit.add ("lemon");

		System.out.println (fruit.size ());
		System.out.println (fruit.get (2)); // banana
		System.out.println (fruit);

		List games = new LinkedList ();
		games.add ("soccer");
		games.add ("hockey");
		games.add ("cricket");
		games.add ("tennis");
		games.add ("rugby");

		System.out.println (games.size ());
		System.out.println (games);


	}
}
