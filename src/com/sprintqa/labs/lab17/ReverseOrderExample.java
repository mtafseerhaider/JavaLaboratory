package com.sprintqa.labs.lab17;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Tafseer Haider
 * 25/07/2020
 */
public class ReverseOrderExample
{
	public static void main (String[] args)
	{
		List games = new LinkedList ();
		games.add ("soccer");
		games.add ("hockey");
		games.add ("cricket");
		games.add ("tennis");
		games.add ("rugby");

		System.out.println (games.size ());
		System.out.println (games);
		Collections.reverse (games);
		System.out.println (games);
		Collections.sort (games, Collections.reverseOrder ());
		System.out.println (games);
	}
}
