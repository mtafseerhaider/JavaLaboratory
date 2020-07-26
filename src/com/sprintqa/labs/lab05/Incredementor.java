/**
 * 
 */
package com.sprintqa.labs.lab05;

/**
 * @author Tafseer Haider
 * 17 Jun 2020
 */
/*
 * Declare two variables x and y. Initialize x with 10. Add 10 and post-incremented x to y. Print the values of x and y before and
 * after post-increment. Now Initialize x with 15. Add 15 and pre-incremented x to y. Print the values of x and y before and after
 * pre-increment. Add 10 and post-decremented x to y. Print the values of x and y before and after post-decrement. Lastly, add 10
 * and pre-decremented x to y. Print the values of x and y before and after pre-decrement. The output of your program should be:
 * 
 * Before x++ : Value of x = 10 Value of y = 20 After x++ : Value of x = 11 Before ++x : Value of x = 15 Value of y = 31 After ++x :
 * Value of x = 16 Before x-- : Value of x = 16 Value of y = 26 After x-- : Value of x = 15 Before --x: Value of x = 15 Value of y =
 * 24 After --x : Value of x = 14
 */
public class Incredementor
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		int x, y;

		// Step 2 - Initialize known values
		x = 10;

		// Step 3 - Get values for the unknown
		// in step 4

		// Step 4 – Implement your code logic and output the program
		System.out.println ("Before x++ : Value of x = " + x);
		y = x++ + 10;
		System.out.println ("Value of y = " + y);
		System.out.println ("After x++ : Value of x = " + x);
		x = 15;
		System.out.println ("Before ++x : Value of x = " + x);
		y = ++x + 15;
		System.out.println ("Value of y = " + y);
		System.out.println ("After ++x : Value of x = " + x);
		System.out.println("Before x-- : Value of x = " + x);
	    y = x-- + 10;
	    System.out.println("Value of y = " + y);
	    System.out.println("After x-- : Value of x = " + x);
	    System.out.println("Before --x: Value of x = " + x);
	    y = --x + 10;
	    System.out.println("Value of y = " + y);
	    System.out.println("After --x : Value of x = " + x);

	}

}
