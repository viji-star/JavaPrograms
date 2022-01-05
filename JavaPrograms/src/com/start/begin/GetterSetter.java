package com.start.begin;
class EncapTest
{
	private int age;
	public int getAge()
	{
		return age;
	}
	public void setAge(int Age)
	{
		age=Age;
	}
}

public class GetterSetter {

	public static void main(String[] args) {
		EncapTest t = new EncapTest();
		t.setAge(10);
		System.out.println(t.getAge());

	}

}
