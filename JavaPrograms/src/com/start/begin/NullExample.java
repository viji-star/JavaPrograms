package com.start.begin;

//code will compile successfully but will not print anything in console
 class sa
{
	public static void display(String name)
	{
		if("null".equals(name))
		{
			System.out.println("Hi Jack");
		}
		
	}
}
public class NullExample {

	public static void main(String[] args) {
		sa.display(null);

	}

}
