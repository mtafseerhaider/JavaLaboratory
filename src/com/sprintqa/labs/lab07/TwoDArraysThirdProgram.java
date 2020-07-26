/**
 * 
 */
package com.sprintqa.labs.lab07;

import java.util.Arrays;

/**
 * @author Tafseer Haider
 * 23 Jun 2020
 */
public class TwoDArraysThirdProgram
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		// Step 1 - Declare known values & unknown values
		int matrix [][] = {    
		            {1, 2, 3},    
		            {4, 5, 6},    
		            {7, 8, 9},
		            {4, 6, 2}
	              };
 
		int rows, columns, size;
		
		// Step 2 - Initialize known values
		// Step 3 - Get values for the unknown
		rows = matrix.length;
		columns = matrix[0].length;
		size = rows * columns;
		
		// Step 4 – Output the program
		System.out.println ("No. of Rows: " + rows);
		System.out.println ("No. of Columns: " + columns);
		System.out.println ("Size of the matrix: " + size);
	}
}
