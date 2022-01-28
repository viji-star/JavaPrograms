package com.start.begin;

// code to be written in Line 1 as per best coding practise
public class Testcode {
	String [] arr = {"Infy","java","ETA"};

	public void show()
	{
		for (int i=0;i<arr.length;i++)
		
			if(arr[i].length()==4 && arr[i].equals("java"))
		{
			System.out.println("Name of the language " + arr[i]);
		}
			else
			{
				System.out.println("Language not found " + arr[i]);
			}
	}
	public static void main(String[] args) {
		
Testcode t =  new Testcode();
t.show();
	}

}
