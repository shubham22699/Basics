package com.basics;

public class Test {
	int id;
	String name; 
	double marks;
	String pin;
	long mob;
	
	Test(int id,String name,double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	Test(int id,String name,double marks,String pin)
	{
		this(id,name,marks);
		this.pin=pin;
	}
	Test(int id ,String name,double marks,String pin,long mob)
	{
		this(id,name,marks,pin);
		this.mob=mob;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
