/**
 * 
 */
package com.sprintqa.labs.lab08;

/**
 * @author Tafseer Haider
 * 26 Jun 2020
 */
public class StringAssignment05
{
	public static void main (String[] args)
	{
		String word = "Floccinaucinihilipilification";
		
		char [] array = word.toUpperCase ().toCharArray ();
		
		for (char character : array)
		{
			System.out.print (character + " ");
		}
		
	}

}
