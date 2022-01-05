
package com.start.begin;

public class InnerClassDemo {

	private int bookid = 110;
	class Book
	{
	private int bookid = 231;
	private int getBookid()
	{
		return bookid;
	}
	}
	
	private int getBookid()
	{
		return bookid;
	}
	public static void main(String[] args) {


		InnerClassDemo in = new InnerClassDemo();
		InnerClassDemo.Book book = in.new Book();
		System.out.print(in.getBookid()+ "" + book.getBookid());

	}

}
