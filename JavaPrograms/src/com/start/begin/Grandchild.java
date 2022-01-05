package com.start.begin;

class Parent
{
	int bookid = 23565;
}
class Child1 extends Parent
{
	int bookid = 1167;
}

class Child2 extends Child1
{
	int bookid = 2378;
	void display()
	{
		//System.out.println(super.super.bookid); ---  In Java, we can access 
		//grandparent’s members only through the parent class. 
		System.out.print(super.bookid);
		System.out.println(bookid);
		
	}
}

public class Grandchild {

	
	public static void main(String[] args) {

		Child2 ch = new Child2();
		ch.display();

	}
	

}
