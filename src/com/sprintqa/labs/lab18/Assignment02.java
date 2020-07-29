package com.sprintqa.labs.lab18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Tafseer Haider
 * 29/07/2020
 */
public class Assignment02
{
	public static void main (String[] args)
	{
		HashMap< String, String > hashMap = new HashMap< String, String > ();
		hashMap.put ("userId", "Phaybound");
		hashMap.put ("firstName", "Davy");
		hashMap.put ("lastName", "Phayboun");
		hashMap.put ("preferredFullName", "Davy Phayboun");
		hashMap.put ("jobTitleName", "Automation Engineer");
		hashMap.put ("employeeCode", "E-0002");
		hashMap.put ("region", "CO");
		hashMap.put ("phoneNumber", "408-1235867");
		hashMap.put ("emailAddress", "phaybound@sprintqa.com");

		// Iterating using Iterator
		System.out.println ("| Iterating using Iterator |");
		System.out.println ();
		Iterator<Map.Entry<String, String>> entries = hashMap.entrySet ().iterator ();
		while (entries.hasNext ())
		{
			Map.Entry<String, String> entry = entries.next ();
			System.out.println ("Key = " + entry.getKey () + ", Value = " + entry.getValue ());
		}

		// Iterating using enhanced for loop
		System.out.println ();
		System.out.println ("| Iterating using enhanced for loop |");
		System.out.println ();
		for (Map.Entry<String, String> entry : hashMap.entrySet ())
		{
			System.out.println ("Key = " + entry.getKey () + ", Value = " + entry.getValue ());
		}
	}
}
