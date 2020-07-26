package com.sprintqa.labs.lab14;

/**
 * @author Tafseer Haider
 * 16/07/2020
 */
class Person
{
	private String profession;
	private String schoolName;

	public String getProfession ()
	{
		return profession;
	}

	public void setProfession (String professionFromUser)
	{
		profession = professionFromUser;
	}

	public String getSchoolName ()
	{
		return schoolName;
	}

	public void setSchoolName (String schoolNameFromUser)
	{
		schoolName = schoolNameFromUser;
	}
}

public class Student
{
	public static void main (String[] args)
	{
		Person person = new Person ();
		person.setProfession ("student");
		person.setSchoolName ("SprintQA");
		System.out.print ("I am a " + person.getProfession () + " and I study at " + person.getSchoolName ());
	}
}
