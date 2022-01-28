package com.start.begin;

public class Palindrome {

	
	public static void main(String[] args) {
		//State whether given string is palindrome or not? 
				//(E.g. I/P NITIN O/P: Given String is Palindrome)

		String inp = "NITgsdN";
		String rev ="";
		for(int i = inp.length()-1;i>=0;i--)
		{
			 rev = rev + inp.charAt(i);
		}
		if(rev.equals(inp))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome");
		}

	}

}
