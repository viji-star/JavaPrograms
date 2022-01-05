package com.start.begin;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		
		int a[] = {4,7,1,9,324,7,9,35};
		System.out.println("Array before sorting");
		for(int f:a)
			System.out.println(f);
		Arrays.sort(a);
		System.out.println("Array after sorting");
		for(int f:a)
			System.out.println(f);
	}

}
