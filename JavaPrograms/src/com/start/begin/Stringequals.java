package com.start.begin;

import java.util.ArrayList;
import java.util.List;

public class Stringequals {

	public static void main(String[] args) {
		String str1 = null;
		String str2 = new String("null");
		System.out.println("null".equals(str1));
		System.out.println("null".equals(str2));
		try {
			System.out.println(str1.equals(str2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//List<> my = new ArrayList<String>();
		List<String> y = new ArrayList<>();

		
		Integer n1 = new Integer(100);
		Integer n2 = new Integer(100);
		Integer n3 = 100;
		Integer n4 = 100;
		
		System.out.println(n1==n2);
		System.out.println(n3==n4);
		
	}

}
