package com.start.begin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleJunit {

	
	@BeforeClass
	public  void start()
	{
		System.out.println("Inside before class");
	}
	
	@Before
	public void setup()
	{
		System.out.println("Inside Before");
	} 
	
	@Test
	public void Bow()
	{
		System.out.println("Inside Test1");
	}
	
	@Test
	public void Arrow()
	{
		System.out.println("Inside Test2");
	}
	
	@After
	public void tear()
	{
		System.out.println("Inside After");
	}
	
	@AfterClass
	public static void end()
	{
		System.out.println("Inside After class");
	}
	
}
