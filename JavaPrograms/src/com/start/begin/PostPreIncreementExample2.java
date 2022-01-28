package com.start.begin;

class Parentcls
{
	private int display1(int i)
	{
		return ++i;
	}
	
	public int display2(int i)
	{
		return display1(--i);
	}
}

class Child extends Parentcls
{
	int display1(int i)
	{
		return display2(++i);
	}
}
public class PostPreIncreementExample2 {

	public static void main(String[] args) {

System.out.println("Value is " + new Child().display1(564));
}	

}
