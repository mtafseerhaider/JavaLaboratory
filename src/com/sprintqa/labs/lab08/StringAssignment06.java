/**
 * 
 */
package com.sprintqa.labs.lab08;

/**
 * @author Tafseer Haider
 * 26 Jun 2020
 */
public class StringAssignment06
{
	public static void main (String[] args)
	{
		String original = "AustraliaVsEngland";
		String rotation = "EnglandAustraliaVs";

		if (original.length () != rotation.length ())
		{
			System.out.println(original + " and " + rotation + " are NOT rotation of each other");
		}

		String concatenated = original.concat (original);

		if (concatenated.indexOf (rotation) != -1)
		{
			System.out.println(original + " and " + rotation + " are rotation of each other");

		}
		else
			System.out.println(original + " and " + rotation + " are NOT rotation of each other");

	}

}
