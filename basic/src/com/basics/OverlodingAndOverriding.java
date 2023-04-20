package com.basics;

class Overriding extends OverlodingAndOverriding
{
	@Override
	public void nameShow()
	{
		System.out.println("Arvind");
	}
}
public class OverlodingAndOverriding {
	
	
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(int a,float f)
	{
		System.out.println(a+f);
	}
	public static void add(double d1,double d2)
	{
		System.out.println(d1+d2);
	}
	
	public void nameShow()
	{
		System.out.println("Shubham");
	}

	public static void main(String[] args) {
		
		OverlodingAndOverriding.add(4, 5);
		
		OverlodingAndOverriding obj=new Overriding();

	}

}
