/**
 * 
 */
package com.sprintqa.labs.lab10;

/**
 * @author Tafseer Haider
 * 3 Jul 2020
 */
public class MethodsProgram1
{

	static void printNumbers ()
	{
		for (int i = 1; i <=10; i++)
		{
			System.out.print (i + " ");
		}
	}
	
	
	public static void main (String[] args)
	{
		System.out.println ("First 10 natural numbers: ");
		printNumbers ();
	}

}
