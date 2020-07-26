package com.sprintqa.labs.lab12;

/**
 * @author Tafseer Haider
 * 09/07/2020
 */
class Smartphone
{
	float display;
	int memory;
	int storage;
	String processor;
	int camera;
	String OS;

	void createSmartPhone ()
	{
		System.out.println ("Display: " + display + " inches");
		System.out.println ("RAM: " + memory + " GB");
		System.out.println ("ROM: " + storage + " GB");
		System.out.println ("Processor: " + processor);
		System.out.println ("Camera: " + camera + " MP");
		System.out.println ("Operating System: " + OS);
	}
}
public class SmartphoneTester
{
	public static void main (String[] args)
	{
		Smartphone samsung = new Smartphone ();
		System.out.println ("Samsung smartphone created with specs: ");
		samsung.display = 6.6f;
		samsung.memory = 8;
		samsung.storage = 512;
		samsung.processor = "Snapdragon 865";
		samsung.camera = 108;
		samsung.OS = "Android";
		samsung.createSmartPhone ();
		System.out.println ();
		Smartphone nokia = new Smartphone ();
		System.out.println ("Nokia smartphone created with specs: ");
		samsung.display = 6.6f;
		samsung.memory = 6;
		samsung.storage = 265;
		samsung.processor = "Snapdragon 855";
		samsung.camera = 108;
		samsung.OS = "Android";
		samsung.createSmartPhone ();

	}

}
