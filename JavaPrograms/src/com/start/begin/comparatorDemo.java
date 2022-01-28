package com.start.begin;

import java.util.Arrays;
import java.util.Comparator;

public class comparatorDemo implements Comparator<String>{

	public static void main(String[] args) {
		
		String [] values = {"JOHN","Annie","JACKLIN"};
		Arrays.sort(values, new comparatorDemo());
		for (String str: values)
		{
			System.out.print(str + " ");
		}

	}

	@Override
	public int compare(String x, String y) {
		return y.toLowerCase().compareTo(x.toLowerCase());
	}

}
