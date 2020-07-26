package com.hackerrank.java.mcqs;

/**
 * @author Tafseer Haider
 * 17/07/2020
 */
class AA {}
class BB extends AA {}

class Base
{
	AA fun ()
	{
		System.out.println ("Base fun()");
		return new AA();
	}
}

class Derived extends Base
{
	BB fun ()
	{
		System.out.println ("Derived fun()");
		return new BB ();
	}
}

public class MCQ04
{
	// What is a covariant return type?
	/*
	  A. The overriding method can have derived type as the return type instead of the base type
	  B. The overriding method can have base type as the return type instead of the derived type
	 */

	public static void main (String[] args)
	{
		Base base = new Base ();
		base.fun ();

		Derived derived = new Derived ();
		derived.fun ();
	}
}
