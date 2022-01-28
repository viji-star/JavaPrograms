package com.start.begin;

interface Book
{
	static void bookName()
	{
		System.out.println("In interface book");
	}
}

class BookImpl implements Book
{
	void bookName()
	{
		System.out.println("In BookImpl class");
	}
}
public class BookApp {

	public static void main(String[] args) {
		
new BookImpl().bookName();
	}

}
