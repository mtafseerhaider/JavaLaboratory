/**
 * 
 */
package com.sprintqa.labs.lab08;

/**
 * @author Tafseer Haider
 * 26 Jun 2020
 */
public class StringAssignment07
{
	public static void main (String[] args)
	{
		int number = 108;
		
		String string = String.valueOf (number);
		string = string.replace ('0', ' ');
		
		System.out.println (string);
		

	}

}
