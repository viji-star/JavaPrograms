package com.start.begin;

import java.util.HashSet;
import java.util.LinkedHashSet;

class NameBean
{
	private String str1;
	
	NameBean(String str1)
	{
		this.str1 = str1;
	}
	
	public String toString()
	{
		return str1;
	}
}
public class HashsetConcept {

	public static void main(String[] args) {

    HashSet hash = new LinkedHashSet ();
    String str1 = new String("jack");
    String str2 = new String("Thomas");
    NameBean bean1 = new NameBean("Android");
    NameBean bean2 = new NameBean("Diana");
    hash.add(str1);
    hash.add(str2);
    hash.add(bean1);
    hash.add(bean2);

    System.out.println(hash);
	}

}
