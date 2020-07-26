/**
 * 
 */
package com.sprintqa.labs.lab07;

/**
 * @author Tafseer Haider
 * 23 Jun 2020
 */
public class SparseMatrix
{
	public static void main (String[] args)
	{
		// Step 1 - Declare known values & unknown values
		// Step 1 - Declare known values & unknown values
		int matrix [][] = {    
				{2, 0, 0},    
                {0, 4, 0},    
                {0, 0, 6} 
	           };
 
		int rows, columns, size, countOfZeros;
		
		// Step 2 - Initialize known values
		countOfZeros = 0;
		
		// Step 3 - Get values for the unknown
		rows = matrix.length;
		columns = matrix[0].length;
		size = rows * columns;
		
		// Step 4 – Implement your code logic
		// Count all zero element present in matrix
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				if (matrix[i][j] == 0)
					countOfZeros++;
			}
		}
		
		// Step 5 – Output the program
		if (countOfZeros > (size / 2))
			System.out.println ("Given matrix is a sparse matrix");
		else
			System.out.println ("Given matrix is not a sparse matrix");
	}
}
