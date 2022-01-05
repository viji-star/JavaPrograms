package com.start.begin;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

class Ravi
{
	public static void main(String[] args) {
		
int i;
//*******************************
String s1 = new String("smart");
String s2 = s1;
if(s1==s2)
{
	System.out.println("hai");
	
}
if(s1.equals(s2))
{
	System.out.println("i");
	Integer int3 = Integer.valueOf("11", 2);
	System.out.println(int3);
	LocalDateTime df = LocalDateTime.of(2020, 5,13,20,46);
	System.out.println(df.get(ChronoField.HOUR_OF_DAY) + df.getDayOfMonth());
	
}
//*******************************
for (i=0;i<3;i++)
{
	System.out.print(i);
}
System.out.print(i);

//*******************************

int twoD[][]=new int[4][];


twoD[0]=new int[1];
twoD[1]=new int[2];
twoD[2]=new int[3];
twoD[3]=new int[4];


for (int p=0;p<4;p++)
{
	for(int q=0;q<i+1;q++)
	{
		//twoD[p][q] - compilation error as there is no assignment operator
	}
}
	System.out.println("executed");
	
	//*******************************
	int arr1[] = {1,2,3};
	int arr2[] = {1,2,3};
	arr1  = arr2;
	System.out.println("arr1 == arr2 " + (arr1==arr2));
	
	
	
	
	
	
	
	}
	
	

}
