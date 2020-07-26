package com.sprintqa.labs.lab11;

/**
 * @author Tafseer Haider
 * 07/07/2020
 */
class Company
{
	String domainName;

	// public constructor
	public Company ()
	{
		domainName = "www.sprintqa.com";
	}
}

public class Main
{
	public static void main (String[] args)
	{
		// object is created in another class
		Company company = new Company ();
		System.out.println ("Domain name = " + company.domainName);
	}
}
