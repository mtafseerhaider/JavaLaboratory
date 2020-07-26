package com.sprintqa.labs.lab12;

/**
 * @author Tafseer Haider
 * 09/07/2020
 */
class Employee
{
	void getEmployeeSalary ()
	{
		double salary = 1500.0;
		System.out.println ("Salary of the employee is: " + salary);
	}

}

public class EmployeeTester
{
	public static void main (String[] args)
	{
		Employee employee = new Employee ();
		employee.getEmployeeSalary ();
	}
}
