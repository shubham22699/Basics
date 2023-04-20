package com.writtenTest1_14Feb;

import java.util.Scanner;

public class TwinPrimeNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		
		boolean num1=prime(a);
		boolean num2=prime(b);
		int diff=a-b;
        if(num1==num2 && diff==2 || diff==-2)
		{
        	System.out.println(a+" and "+b+" are TwinPrime Number");
		}
        else
        {
        	System.out.println(a+" and "+b+" are not TwinPrime Number");
        }

	}
	
	public static boolean prime(int n)
	{
		boolean checkPrime=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				checkPrime=false;
				break;
			}
		}
		return checkPrime;
	}

}
