package com.start.begin;

public class Truncate {

	public static void main(String[] args) {
		// Truncate digits and special characters from given string and print the string. 
		//(E.g I/P: Te$t!n9 $has7tra O/P: Tetn hastra)

		truncate("Te$t!n9 $has7tra");
	}

	public static void truncate(String inp)
	{
		String letter = " ";
		String digit =" " ;
		String spl = " ";

		for (int i = 0;i<=inp.length()-1;i++)
		{
			if(Character.isLetter(inp.charAt(i)))
			{
				letter = letter + inp.charAt(i);
			}
			else if(Character.isDigit(inp.charAt(i)))
			{
				digit = digit + inp.charAt(i);
			}
			else
			{
				spl = spl + inp.charAt(i);
			}
		}
		
	System.out.println("Letters are : " +letter);
	System.out.println("Digits are : " +digit);
	System.out.println("Spl characters are : " +spl);
						
		}
		
	
}

