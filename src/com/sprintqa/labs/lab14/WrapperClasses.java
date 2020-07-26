package com.sprintqa.labs.lab14;

/**
 * @author Tafseer Haider
 * 16/07/2020
 */
public class WrapperClasses
{
	public static void main (String[] args)
	{
		// create primitive type
		short sNum = 5;
		int iNum = 6;
		double dNum = 5.005;
		char cChar = 'S';
		boolean switchOn = true;
		
		// convert primitive types to their respective wrapper classes
		Short sNumObject = sNum;
		Integer iNumObject = iNum; 
		Double dNumObject = dNum;
		Character cCharObject = cChar;
		Boolean switchOnObject = switchOn;

		// convert back to primitive type
		System.out.println ("short value: " + sNumObject.byteValue ());
		System.out.println ("integer value: " +iNumObject.intValue ());
		System.out.println ("double value: " +dNumObject.doubleValue ());
		System.out.println ("character value: " +cCharObject.charValue ());
		System.out.println ("boolean value: " +switchOnObject.booleanValue ());
	}
}
