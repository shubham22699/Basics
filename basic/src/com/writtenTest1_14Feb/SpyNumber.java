package com.writtenTest1_14Feb;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		int sum=0;
		int prod=1;
		
		while(num>0)
		{
			int rem=num%10;
		    sum+=rem;
		    prod*=rem;
		    
		    num/=10;
		}
		
		if(sum==prod)
		{
			System.out.println("It is Spy Number");
		}
		else
		{
			System.out.println("It is not Spy Number");
		}
	}

}
