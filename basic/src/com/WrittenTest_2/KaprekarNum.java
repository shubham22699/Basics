package com.WrittenTest_2;

import java.util.Scanner;

public class KaprekarNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		int sqr=num*num;
		int temp=num;
		
		int count=0;
		
		while(num>0)
		{
			count++;
			num/=10;
		}
		//System.out.println(count);
		num=temp;
		int p=1;
		for(int i=1;i<=count;i++)
		{
			p*=10;
		}
		System.out.println(p);
		int rem=sqr%p;
		sqr/=p;
		
		System.out.println(rem);
		System.out.println(sqr);
		int sum=0;
		if(rem!=0 && sqr!=0)
		{
		   sum=rem+sqr;
		}
		   if(num==sum)
	     	{
			System.out.println("It is kaprekar number");
	     	}
	    	else
		    {
			System.out.println("It is not a Kaprekar number");
		    }
		
		

	}

}
