package com.start.begin;

public class TrySample {

	public static void main(String[] args) {

try
{
	System.out.println("In Try block");
	System.exit(0);
}
catch (Exception ex)
{
	System.out.println("In Catch block");
	ex.printStackTrace();
}

finally
{
	System.out.println("In Finally block");
}
	}

}
