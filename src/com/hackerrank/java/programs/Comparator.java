package com.hackerrank.java.programs;

/**
 * @author Tafseer Haider
 * 17/07/2020
 */
class Comparator
{
	boolean compare (int a, int b)
	{
		if (a == b)
			return true;

		return false;
	}

	boolean compare (String a, String b)
	{
		if (a.equals (b))
			return true;

		return false;
	}

	boolean compare (int[] a, int[] b)
	{
		for (int i=0; i <=10; i++)
		{
			if (a.length == b.length && a[i] == b[i])
				return true;
		}

		return false;
	}

}
