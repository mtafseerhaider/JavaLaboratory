package com.hackerrank.java.challenges;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 17/07/2020
 */
/*
In this challenge, you must read an integer, a double, and a String from scanner, then print the values according to
the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is
provided for you in the editor.
 */
public class JavaInputChallenge
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner (System.in);
		int i = scan.nextInt ();
		double d = scan.nextDouble ();
		scan.nextLine();
		String s = scan.nextLine ();

		System.out.println ("String: " + s);
		System.out.println ("Double: " + d);
		System.out.println ("Int: " + i);
	}
}
