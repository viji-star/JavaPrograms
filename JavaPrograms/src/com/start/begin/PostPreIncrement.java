package com.start.begin;

public class PostPreIncrement {

	public static void main(String[] args) {
		
		int numbers[] = new int[2];
		
		numbers[0] = 1265;
		numbers[1] = 1212;
		
		int j=0;
		for (int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[j]);
			++j;
		}
	}

}
