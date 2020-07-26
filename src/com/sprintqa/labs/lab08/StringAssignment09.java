/**
 * 
 */
package com.sprintqa.labs.lab08;

/**
 * @author Tafseer Haider
 * 26 Jun 2020
 */
public class StringAssignment09
{
	public static void main (String[] args)
	{
		String string = "programming";
		String reverse = "";
		
		for (int i = string.length () - 1; i >= 0; i--)
		{
			reverse = reverse + string.charAt (i);
		}

		System.out.println (reverse);
	}

}
