package com.start.begin;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollectionsSort {

	public static void main(String[] args) {


		ArrayList<String> str = new ArrayList<String>();
		str.add("aAaA");
		str.add(""
				+ "A");
		str.add("aAa");
		Collections.sort(str);
		for (String s: str)
		{
			System.out.print(s + " ");
		}

	}

}
