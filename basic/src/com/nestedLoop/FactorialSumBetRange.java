package com.nestedLoop;

import java.util.Scanner;

public class FactorialSumBetRange {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b=sc.nextInt();
		
		int sum=0;
		
		for(int i=a;i<=b;i++)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact*=j;
			}
			sum+=fact;
		}
		
		System.out.println(sum);


	}

}
