package com.start.begin;

abstract class  StaticAbstract
{
	 void staticMethod()
	{
		System.out.println("Inside Abstractclass");
	}
}

class StaticAbstractImpl extends StaticAbstract
{
	public void staticMethod()
	{
		System.out.println("Inside class");
	}
}
public class StaticOverrideInAbsract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
