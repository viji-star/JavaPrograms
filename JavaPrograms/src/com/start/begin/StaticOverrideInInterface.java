package com.start.begin;

interface StaticInterface
{
	static void staticMethod()
	{
		System.out.println("Inside interface");
	}
}

class StaticInterfaceImpl implements StaticInterface
{
	public void staticMethod()
	{
		System.out.println("Inside class");
	}
}
public class StaticOverrideInInterface {

	public static void main(String[] args) {
		new StaticInterfaceImpl().staticMethod();
		
	}

}
