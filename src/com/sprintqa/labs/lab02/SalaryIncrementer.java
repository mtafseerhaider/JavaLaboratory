package com.sprintqa.labs.lab02;

/**
 * @author Tafseer Haider
 * 10 Jun 2020
 */
public class SalaryIncrementer
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		double salary, incrementPercent, incrementAmount;

		// Step 2 - Initialize known values
		salary = 1600.00;
		incrementPercent = 18;

		// Step 3 - Get values for the unknown
		incrementAmount = (incrementPercent / 100) * salary; // use hint: percent formula

		// Step 4 – Implement your code logic
		salary += incrementAmount; // compute incremented salary

		// Step 5 – Output the program
		System.out.println ("Total Increment is: " + incrementAmount);
		System.out.println ("Total Incremented Salary is: " + salary);

	}

}
