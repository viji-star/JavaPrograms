package com.start.begin;

public class CharaOccurance {

	public static void main(String[] args) {
		// I/P - TTTEESSSSTTTTIIIIINNG
		//O/P - T3E2S4T4I5N2G1
		
		String result = occurance("TTTEESSSSTTTTIIIIINNGGBYH");
		
		System.out.println(result);
	}

public static String occurance(String inp)
{
	String output ="";
	int count = 1;
for(int i = 0;i<inp.length()-1;i++)
{
	if(inp.charAt(i)!=(inp.charAt(i+1)))
	{
		
		output=output+inp.charAt(i)+(count);
		count=1;
	}
	else
	{
		count++;
	}
}
output = output+inp.charAt(inp.length()-1)+(count);
return(output);
}
}
