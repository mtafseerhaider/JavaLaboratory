package com.sprintqa.labs.lab17;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Tafseer Haider
 * 24/07/2020
 */
public class QueueExample
{
	public static void main (String[] args)
	{
		Queue fruit = new LinkedList ();
		fruit.add ("apple");
		fruit.add ("banana");
		fruit.add ("mango");
		fruit.add ("orange");
		fruit.add ("mango");

		System.out.println (fruit.size ());
		System.out.println (fruit);
		fruit.remove (); // remove the first one (aka head) in the queue
		System.out.println (fruit);
		/*
		 Sometimes we may want to know what's the next item to be processed before we actually do anything.
		 For that you can use peek() which returns the head of the queue.
		 */
		System.out.println (fruit.peek ()); // returns the head of the queue

	}
}
