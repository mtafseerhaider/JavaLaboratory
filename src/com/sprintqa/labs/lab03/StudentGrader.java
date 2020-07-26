/**
 * 
 */
package com.sprintqa.labs.lab03;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 11 Jun 2020
 */
public class StudentGrader
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		double score;
		char grade;

		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);
		
		// Step 3 - Get values for the unknown
		System.out.println("Enter your test score:");
		score = scanner.nextDouble();
		scanner.close (); // close the scanner object

		// Step 4 – Implement your code logic
		if (score < 60)
		{
			grade = 'F';
		}
		else if (score < 70)
		{
			grade = 'D';
		}
		else if (score < 80)
		{
			grade = 'C';
		}
		else if (score < 90)
		{
			grade = 'B';
		}
		else
		{
			grade = 'A';
		}

		// Step 5 - Output the program
		System.out.println ("Your grade is " + grade);
	}

}
