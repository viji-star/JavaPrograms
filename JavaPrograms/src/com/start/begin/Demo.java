package com.start.begin;

class Customer
{
	public void display()
	{
		
	}
}class Employee
{
	public void display()
	{
		
	}
}
public class Demo {

	public static void main(String[] args) {
		Customer customer = new Customer();
		//Employee employee = (Employee) customer; -- compilation error due to cast conversion
		//employee.display();
		customer.display();

	}

}
