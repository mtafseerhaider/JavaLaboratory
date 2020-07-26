package com.hackerrank.java.challenges;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 18/07/2020
 */
/*
https://www.hackerrank.com/challenges/java-end-of-file/problem?h_r=next-challenge&h_v=zen
 */
public class JavaEndOfFile
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		int i = 1;
		while (scanner.hasNext ())
		{
			System.out.println (i++ + " " + scanner.nextLine ());
		}
		scanner.close ();
	}
}
