/**
 * 
 */
package com.sprintqa.labs.lab08;

/**
 * @author Tafseer Haider 25 Jun 2020
 */
public class StringAssignment03
{
	public static void main (String[] args)
	{
		String quote = "Knowing Is Not Enough; We Must Apply. Wishing Is Not Enough; We Must Do.";
		int count = 0;

		// Counts each character except space
		for (int i = 0; i < quote.length (); i++)
		{
			if (quote.charAt (i) != ' ' && quote.charAt (i) != ';' && quote.charAt (i) != '.')
				count++;
		}

		// Displays the total number of characters present in the given string
		System.out.println ("Total number of alphabetical characters in the given quote: " + count);
	}

}
