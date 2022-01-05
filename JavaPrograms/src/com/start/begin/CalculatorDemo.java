package com.start.begin;

class Calculator
{
	int a= 123;int b= 200;
	public void display()
	{
		System.out.println("a:" +a + "b:" + b + "");
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator calculator1 = new Calculator();
		Calculator calculator2 = calculator1;

		calculator1.a+=1;
		calculator1.b+=1;
		
		System.out.println("Calculator1 values:");
		calculator1.display();
		System.out.println("Calculator2 values:");
		calculator1.display();
		
		if (calculator1 == calculator2)
		{
			System.out.println("Example for == function");
		}
		
		else
		{
			System.out.println("Not an Example for == function");
		}
	}

}
