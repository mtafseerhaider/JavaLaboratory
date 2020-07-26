/**
 * 
 */
package com.sprintqa.labs.lab08;

/**
 * @author Tafseer Haider
 * 26 Jun 2020
 */
public class StringAssignment10
{
	public static void main (String[] args)
	{
		String word = "racecar";
		
		for (int i = 0; i < word.length () / 2; i++)
		{
			if (word.charAt (i) != word.charAt (word.length () - 1 - i))
			{
				System.out.println (word + " is NOT palindrome.");
			}
						
		}
		
		System.out.println (word + " is a palindrome.");
	}

}
