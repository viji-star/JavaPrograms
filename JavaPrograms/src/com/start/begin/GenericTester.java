package com.start.begin;

import java.util.ArrayList;
import java.util.List;

public class GenericTester {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(22);
		list.add(23);
		method(list);

	}
	public static void method (List <Integer> list) //in the question it is given as List <Double> list, hence compilation error
	{
		System.out.println(list);
	}

}
