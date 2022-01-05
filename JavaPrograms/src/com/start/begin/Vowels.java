package com.start.begin;

import java.util.ArrayList;

public class Vowels {

	public static void main(String[] args) {
		//Find number of vowels in a given String

		char ch[] = {'a','e','i','o','u'};
		
		int count = 0;
		//ArrayList <String> str = new ArrayList <String> ();
		//str.add("Java");
		
		String str = "Philosophytour";
		for (int j=0;j<=str.length()-1;j++) 
		{
			
		for(int i=0;i<ch.length;i++)
		{
			if (str.charAt(j) == ch[i])
			{
				count ++;
			}
		}
		}
		
		System.out.println(count);
	}

}
