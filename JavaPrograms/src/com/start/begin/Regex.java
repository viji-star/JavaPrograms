package com.start.begin;

public class Regex {

	public static void main(String[] args) {

try
{
	checkName("TioT");
}
catch(Exception r)
{
	System.out.println("Exception 1");
}

	}
	

	static void checkName(String name)
	{
		try 
		{
			if(!name.matches("T[aei]{3}T")) 
			{
				throw new RuntimeException("Name is invalid");
			}
			else
			{
				System.out.println("Name is valid");
			}
		}
		catch(NullPointerException r)
		{
			System.out.println("Exception 2");
		}
	}
}
