package com.start.begin;

interface Greet
{
	void sayHi(String message);
}
public class App {
	 static String  msg = "Hello!";
	public static void main(String[] args) {
		Greet service  = message -> System.out.println(msg +message);
		// compilation error if field msg is not made as static
		service.sayHi("John");
	}

}
