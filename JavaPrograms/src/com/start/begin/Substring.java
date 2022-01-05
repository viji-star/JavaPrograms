package com.start.begin;

public class Substring {

	public static void main(String[] args) {
		// Find a given Substring and its occurrence in a main String.
		//(E.g Main String: “I love India.”
		//Find Substring ‘Love’ and its occurrence)

		
		String str = "i love India and love Europe as well";
		String ch[]=str.split(" ");
		int count=0;
		for(int i = 0;i<=ch.length-1;i++)
		{
			if(ch[i].equalsIgnoreCase("Love"))
			count ++;
		}
		
		System.out.println(count);
	}

}
