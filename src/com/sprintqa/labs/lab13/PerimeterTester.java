package com.sprintqa.labs.lab13;

/**
 * @author Tafseer Haider
 * 14/07/2020
 */
class Rectangle
{
	private double length = 8;
	private double width  = 10;

	public double calculatePerimeter ()
	{
		return (2 * length) + (2 * width);
	}
}

class Square extends Rectangle
{
	private double length = 8;
	private int    sides   = 4;

	@Override
	public double calculatePerimeter ()
	{
		return sides * length;
	}
}

public class PerimeterTester
{
	public static void main (String[] args)
	{
		Rectangle rectangle = new Rectangle();
		System.out.println ("Perimeter of Rectangle: " + rectangle.calculatePerimeter ());
        Square square = new Square ();
		System.out.println ("Perimeter of Square: " + square.calculatePerimeter ());
	}

}
