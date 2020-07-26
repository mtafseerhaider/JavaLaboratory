package com.hackerrank.java.challenges;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 18/07/2020
 */
/*
https://www.hackerrank.com/challenges/java-loops-i/problem
 */
public class JavaLoopsI
{
	private static final Scanner scanner = new Scanner (System.in);

	public static void main (String[] args)
	{
		int N = scanner.nextInt ();
		scanner.skip ("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int i = 1; i <= 10; i++)
		{
			System.out.println (N + " x " + i + " = " + N * i);
		}

		scanner.close ();
	}
}
