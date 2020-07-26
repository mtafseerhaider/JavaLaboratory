/**
 * 
 */
package com.sprintqa.labs.lab10;

/**
 * @author Tafseer Haider
 * 3 Jul 2020
 */
public class MethodsProgram04
{

	static int convertDoubleToInt (double num)
	{
		int numi = (int) num; 
		
		return numi;
	}
	
	public static void main (String[] args)
	{
		System.out.println ("Number in int: " + convertDoubleToInt (15.4864));
	}

}
