package com.sprintqa.labs.lab17;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tafseer Haider
 * 24/07/2020
 */
public class LoopThroughListWithForEach
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

		fruit.forEach (item -> System.out.println (item));

		/*
		For this lambda expression, you can even give this a little shortcut — what they call “syntactic sugar”
		where you can clean this up by using shorthand.
        Instead of declaring this variable and using the arrow, you can just use a System.out and then put
        double colon and the method that you want to use.
		 */
		fruit.forEach (System.out::println); // What this is saying is, call this method and pass in whichever item we're on.
	}
}
