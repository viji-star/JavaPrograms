package com.start.begin;

public class Equals {

	public static void main(String[] args) {

//difference of equals method of object and String class
// object class - checks for reference variable
// string class checks for content rather than reference variable
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1.equals(o2));
		
		Object o3 = new Object();
		Object o4 = new Object();
		o3=o4;
		System.out.println(o3.equals(o4));
		
		
		String s1=new String("FAST");
		String s2=new String("FAST");
		System.out.println(s1.equals(s2));
		
		String s3=new String("FAST");
		String s4=new String("CHAIR");
		System.out.println(s3.equals(s4));
		
		String s5 = new String("smart");
		String s6=s5;
		if(s5==s6)
		{
			System.out.println("==smart");
		}
		if(s5.equals(s6))
		{
			System.out.println("equls smart");
		}
		
	}

}
