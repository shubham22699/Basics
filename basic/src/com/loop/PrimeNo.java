package com.loop;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		int i;
		for(i=2;i<num;i++)
		{
			if (num%i==0)
			{
			    break;	
			}
		}
		if (i==num)
		{
		    System.out.println("It is prime number");	
		}
		else
		{
			System.out.println("It is not prime number");
		}

	}

}
