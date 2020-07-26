package com.hackerrank.java.mcqs;

/**
 * @author Tafseer Haider
 * 17/07/2020
 */
class A
{
	int add (int i, int j)
	{
		return i+j;
	}
}
public class MCQ01 extends A
{
	public static void main (String[] args)
	{
		short s = 9;
		//System.out.println (add(s,6));
		//Answer
		// Compilation fails due to error an on line 9, non-static method referenced from a static context.
	}
}
