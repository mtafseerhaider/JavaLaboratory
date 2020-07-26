package com.sprintqa.labs.lab08;

/**
 * @author Tafseer Haider
 * 26 Jun 2020
 */
public class StringAssignment08
{
	public static void main (String[] args)
	{

		String quote = "Live as if you were to die tomorrow. Learn as if you were to live forever.";
		
		int vowelCount = 0, consonantCount = 0;

		quote = quote.toLowerCase ();

		for (int i = 0; i < quote.length (); i++)
		{
			// Checks whether a character is a vowel
			if (quote.charAt (i) == 'a' || quote.charAt (i) == 'e' || quote.charAt (i) == 'i' || quote.charAt (i) == 'o' || quote.charAt (i) == 'u')
			{
				// Increments the vowel counter
				vowelCount++;
			}
			// Checks whether a character is a consonant
			else if (quote.charAt (i) >= 'a' && quote.charAt (i) <= 'z')
			{
				// Increments the consonant counter
				consonantCount++;
			}
		}
		
		System.out.println ("Number of vowels: " + vowelCount);
		System.out.println ("Number of consonants: " + consonantCount);
	}
}
