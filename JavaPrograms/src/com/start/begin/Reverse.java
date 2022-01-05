package com.start.begin;

public class Reverse {

	public static void main(String[] args) {
		
		//Reverse the given String. (E.g. I/P: Shastra O/P: artsahS)
		
		String inp = "Shastra";
		String rev ="";
		for(int i = inp.length()-1;i>=0;i--)
		{
			 rev = rev + inp.charAt(i);
		}
		System.out.println(rev);

	}

}
