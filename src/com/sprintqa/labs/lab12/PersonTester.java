package com.sprintqa.labs.lab12;

/**
 * @author Tafseer Haider
 * 09/07/2020
 */
class Person
{
	static String name = "Tafseer"; // static variable
	int age = 30; // instance variable aka non-static variable
}


public class PersonTester
{
	public static void main (String[] args)
	{
		Person person = new Person ();
		System.out.println ("Name of the person: " + Person.name);
		System.out.println ("Age of the person: " + person.age);
	}
}
