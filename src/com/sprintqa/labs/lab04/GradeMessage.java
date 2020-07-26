/**
 * 
 */
package com.sprintqa.labs.lab04;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 16 Jun 2020
 */
/*
 * Write a program that asks what is student's grade. If grade is A, then print "Excellent job!". If B, then print "Great job!". If
 * C, then print "Good job!". If D, then print "You need to work a bit harder". If C, the print "Sorry, try again!". If student
 * enters other than these grades, print "Error. Invalid grade". The sample input and output of your program should be: Enter your
 * letter grade: D You need to work a bit harder
 */
public class GradeMessage
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		String grade, message;
		
		// Step 2 - Initialize known values
		Scanner scanner = new Scanner (System.in);
		
		// Step 3 - Get values for the unknown
		System.out.println ("Enter your letter grade:");
		grade = scanner.next ();
		scanner.close ();

		// Step 4 – Implement your code logic
		switch (grade)
		{
			case "A":
				message = "Excellent job!";
				break;
			case "B":
				message = "Great job!";
				break;
			case "C":
				message = "Good job!";
				break;
			case "D":
				message = "You need to work a bit harder";
				break;
			case "F":
				message = "Sorry, try again!";
				break;
			default:
				message = "Error. Invalid grade";
				break;
		}
		
		// Step 5 - Output the program
		System.out.println (message);

	}

}
