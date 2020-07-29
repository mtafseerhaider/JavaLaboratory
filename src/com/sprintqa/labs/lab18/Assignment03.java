package com.sprintqa.labs.lab18;

/**
 * @author Tafseer Haider
 * 29/07/2020
 */
public class Assignment03
{
	public static void main (String[] args)
	{
		String strString = "SprintQA";

		// reverse using for loop
		String reverse = "";
		for (int i = strString.length () - 1; i >= 0; i--)
		{
			reverse = reverse + strString.charAt (i);
		}
		System.out.println ("Reversed using for loop: " + reverse);

		// reverse using StringBuilder
		StringBuilder stringBuilder = new StringBuilder("SprintQA");
		System.out.println ("Reversed StringBuilder: " + stringBuilder.reverse ());

		// reverse using StringBuffer
		StringBuffer stringBuffer = new StringBuffer("SprintQA");
		System.out.println ("Reversed StringBuffer: " + stringBuffer.reverse ());

	}
}
