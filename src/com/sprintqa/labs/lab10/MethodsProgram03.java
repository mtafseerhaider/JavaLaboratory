/**
 * 
 */
package com.sprintqa.labs.lab10;

/**
 * @author Tafseer Haider
 * 3 Jul 2020
 */
public class MethodsProgram03
{

	static boolean isLengthCorrect (String string)
	{
		if (string.length () == 10)
		{
			return true;
		}
		
		return false;
	}
	
	
	public static void main (String[] args)
	{
		String givenString = "Sprinters!";
		
		System.out.println ("Length of given string is 10: " + isLengthCorrect (givenString));
				

	}

}
