package com.start.begin;

final class Square
{
	private double length,breath;
	public Square(double length,double breath)
	{
		this.length=length;
		this.breath=breath;
	}
	Square(Square square)
	{
		System.out.println("Copy constructor invoked");
		length=square.length;
		breath=square.breath;
		
	}
	
	public String toString()
	{
		return "(" + length + " + " + breath + "i)";
	}
}
public class SquareCls {

	public static void main(String[] args) {
		
		Square square1 = new Square(110,115);
		Square square2 = new Square(square1);
		System.out.println(square2);

	}

}
