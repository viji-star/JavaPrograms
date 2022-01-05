package com.start.begin;

import java.util.HashMap;

public class CharOccuranceHashMap {

	public static void main(String[] args) {

HashMap <Character,Integer> map = new HashMap <Character,Integer> ();

String input = "TTTEESSSSTTTTIIIIINNG";
//o/p - {S=4, T=7, E=2, G=1, I=5, N=2}
char  ch[] = input.toCharArray();

for (char c: ch)
{
	if(map.containsKey(c))
	{
		map.put(c, map.get(c)+1);
	}
	else
	{
		map.put(c, 1);
	}
}

System.out.println(map);
	}

}
