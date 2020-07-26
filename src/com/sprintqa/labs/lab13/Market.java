package com.sprintqa.labs.lab13;

/**
 * @author Tafseer Haider
 * 14/07/2020
 */
class Fruit
{
	private int calories;

	public int getCalories ()
	{
		return calories;
	}

	public void setCalories (int calories)
	{
		this.calories = calories;
	}

	public void makeJuice ()
	{
		System.out.println ("Juice is made");
	}
}

class Apple extends Fruit
{

	public Apple ()
	{
		setCalories (95);
	}

	public void removeSeeds ()
	{
		System.out.println ("Apple seeds removed");
	}

	@Override public void makeJuice ()
	{
		System.out.println ("Apple juice is my favorite ?");
	}
}

class Banana extends Fruit
{

	public Banana ()
	{
		setCalories (105);
	}

	public void peel ()
	{
		System.out.println ("Banana has been peeled");
	}

	@Override public void makeJuice ()
	{
		System.out.println ("Banana juice is gross ?");
	}
}

public class Market
{
	public static void main (String[] args)
	{
		Fruit apple = new Apple ();
		((Apple) apple).removeSeeds ();

		Apple apple2 = new Apple ();
		apple2.removeSeeds ();

		Banana banana = new Banana ();
		banana.peel ();

		Fruit banana2 = new Banana ();
		((Banana) banana2).peel ();

		Fruit orange = new Fruit ();

		squeeze (apple);
		squeeze (banana);
		squeeze (banana2);
		squeeze (orange);

	}

	public static void squeeze (Fruit fruit)
	{
		System.out.print ("Squeezing...");
		fruit.makeJuice ();
	}
}
