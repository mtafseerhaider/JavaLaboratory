/**
 * 
 */
package com.sprintqa.labs.lab05;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 17 Jun 2020
 */
/*
 * Write a program to print the multiplication table 1-10 of a number entered by user using a while loop. The sample input and
 * output of your program should be:
 * 
 * Enter your number to print its multiplication table: 5 5*1 = 5 5*2 = 10 5*3 = 15 5*4 = 20 5*5 = 25 5*6 = 30 5*7 = 35 5*8 = 40 5*9
 * = 45 5*10 = 50
 */
public class MultiplicationTable
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int num, sentinel;

		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);
		sentinel = 1;
		
		// Step 3 - Get values for the unknown
		System.out.println ("Enter your number to print its multiplication table:");
		num = scanner.nextInt ();
		scanner.close ();
		
		// Step 4 – Implement your code logic and output the program
		while (sentinel <= 10)
		{
			 System.out.println(num + "*" + sentinel + " = " + (num * sentinel));
			 sentinel++;
		}

	}
}
