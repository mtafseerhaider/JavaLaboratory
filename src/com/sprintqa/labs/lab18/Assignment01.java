package com.sprintqa.labs.lab18;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Tafseer Haider
 * 29/07/2020
 */
public class Assignment01
{
	public static void main (String[] args)
	{
		HashMap < String, String > hashMap = new HashMap< String, String > ();
		hashMap.put ("userId", "EmbelV");
		hashMap.put ("firstName", "Vildan");
		hashMap.put ("lastName", "Embel");
		hashMap.put ("preferredFullName", "Vildan Embel");
		hashMap.put ("jobTitleName", "Automation Engineer");
		hashMap.put ("employeeCode", "E-0001");
		hashMap.put ("region", "WA");
		hashMap.put ("phoneNumber", "408-1234567");
		hashMap.put ("emailAddress", "embelv@sprintqa.com");

		// set view of the map
		Set setView = hashMap.entrySet();
		System.out.println("Set view of the map: " + setView);
		System.out.println ();

		// collection view of the map
		System.out.println("Collection view of the map: " + hashMap.values ());
		System.out.println ();

		// keyView of map
		Set keyView = hashMap.keySet();
		System.out.println("Key view of the map: " + keyView);
		System.out.println ();

		// print the map
		System.out.println("The original map: " + hashMap);
		System.out.println ();

		// create a new map
		HashMap < String, String > newHashMap = new HashMap< String, String > ();
		newHashMap = (HashMap) hashMap.clone ();
		System.out.println("The cloned map: " + newHashMap);

	}

}
