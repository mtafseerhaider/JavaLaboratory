package com.hackerrank.java.challenges;

import java.util.Scanner;

/**
 * @author Tafseer Haider
 * 18/07/2020
 */
/*
https://www.hackerrank.com/challenges/java-static-initializer-block/problem?h_r=next-challenge&h_v=zen
 */
public class JavaStaticInitializerBlock
{
	static Scanner sc = new Scanner (System.in);
	static int     B  = sc.nextInt ();
	static int     H  = sc.nextInt ();
	static boolean flag;

	static
	{
		try
		{
			if (B > 0 && H > 0)
			{
				flag = true;
			}
			else
			{
				throw new Exception ("Breadth and height must be positive");
			}
		}
		catch (Exception e)
		{
			System.out.println (e);
		}
	}

	public static void main (String[] args)
	{
		if (flag)
		{
			int area = B * H;
			System.out.print (area);
		}

	}
}
