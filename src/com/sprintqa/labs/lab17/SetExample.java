package com.sprintqa.labs.lab17;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Tafseer Haider
 * 24/07/2020
 */
public class SetExample
{
	public static void main (String[] args)
	{
		Set fingers = new HashSet ();
		fingers.add ("thumb");
		fingers.add ("index");
		fingers.add ("middle");
		fingers.add ("ring");
		fingers.add ("pinkie");

		System.out.println ("Total fingers in hand: " + fingers.size ());
		System.out.println ("Names of the fingers are: " + fingers);
	}

}
