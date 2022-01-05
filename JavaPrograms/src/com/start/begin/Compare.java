package com.start.begin;

import java.util.Comparator;
import java.util.TreeSet;

public class Compare implements Comparable,Comparator{

	private int number;
	private String data;
	Compare(int i,String str)
	{
		this.number=i;
		this.data=str;
	}

	public String toString()
	{
		return "" + number;
	}

	public int compareTo(Compare comp) {
	
		return data.compareTo(comp.data);
	}

	public int compare(Compare comp1,Compare comp2) {


		return comp1.number-comp2.number;
	}
	public static void main(String[] args) {
Compare comp1 = new Compare(88,"a");
Compare comp2 = new Compare(55,"b");
TreeSet tree = new TreeSet();
tree.add(comp1);
tree.add(comp2);
System.out.println(tree);
	}


	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
