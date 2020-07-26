package com.sprintqa.labs.lab08;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author Tafseer Haider
 * 27/06/2020
 */
public class StringManipulations
{
	public static void main (String[] args)
	{
		// string is a sequence of characters
		// creating string using string literals
		String string1 = "First way";
		// creating string using the new keyword
		String string2 = new String ("Second Way");

	/*
	   In Java, the JVM maintains a string pool to store all of its strings inside the memory.
	   The string pool helps in reusing the strings.

	   While creating strings using string literals, the value of the string is directly provided.
	   Hence, the compiler first checks the string pool to see if the string already exists.

	   If the string already exists, the new string is not created. Instead, the new reference points
	   to the existing string.

	   If the string doesn't exist, the new string is created.

	   However, while creating strings using the new keyword, the value of the string is not directly
	   provided. Hence the new string is created all the time.

	 */

		// length()
		String lengthDemo = "SprintQA";
		System.out.println ("length of " + lengthDemo + " is: " + lengthDemo.length ());

		// chatAt()
		String charAtDemo = "Welcome to SprintQA";
		char first = charAtDemo.charAt (0);
		char last = charAtDemo.charAt (charAtDemo.length () - 1);
		System.out.println ("First character in " + charAtDemo + " is " + first);
		System.out.println ("Last character in " + charAtDemo + " is " + last);
		System.out.println ("Any character in " + charAtDemo + " is " + charAtDemo.charAt (5));

		// concat()
		String s1 = "Greetings";
		String s2 = " Sprinters!";
		String s3 = s1.concat (s2);
		System.out.println (s3);

		String s4 = "Hello".concat (" World!");
		System.out.println (s4);

		// toUppderCase and toLowerCase
		String caseString = "Best Apology is a Changed Behaviour.";
		String uppercase = caseString.toUpperCase ();
		String lowercase = caseString.toLowerCase ();
		System.out.println (uppercase);
		System.out.println (lowercase);

		// equals and equalsIgnoreCase
		String str1 = "Java";
		String str2 = "Programming";
		System.out.println (str1.equals ("Java"));
		System.out.println (str1.compareTo ("Java"));
		System.out.println (str2.compareTo ("Java"));
		System.out.println (str2.equals ("Java"));
		System.out.println (str1.equalsIgnoreCase ("java"));

		// toCharArray
		char [] array = str2.toCharArray ();
		for (char ch : array)
		{
			System.out.println (ch + " ");
		}

		// indexOf
		String str3 = "string manipulation";
		System.out.println (str3.indexOf ('m'));
		System.out.println (str3.indexOf ('n'));
		System.out.println (str3.indexOf ('z'));

		// valueOf
		int num = 12;
		System.out.println (String.valueOf (num));

		// replace
		System.out.println (str3.replace ('g', 't'));

		// substring
		String example = "Hello World";
		System.out.println("Using the subString(): " + example.substring(0,5));
		System.out.println("Using the subString(): " + example.substring(6));

		// split
		String example2 = "support@sprintqa.com";
		String[] parts = example2.split("@");
		for (String part : parts)
		{
			System.out.println (part);
		}

		// join
		System.out.println (String.join (" ", "Sprint", "QA"));


		// contains
		System.out.println (example.contains ("World"));

        // trim
		String example3 = " Hello World ";
		System.out.println (example3.trim ());

		// startsWith
		String str = new String("A quick brown fox jumps over the lazy dog");
		System.out.println("String str starts with quick: "+ str.startsWith("A quick"));

		//
		String str0 = new String();
		System.out.println (str0);


	}


}
