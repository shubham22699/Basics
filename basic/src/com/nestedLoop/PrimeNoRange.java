package com.nestedLoop;

import java.util.Scanner;

public class PrimeNoRange {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b=sc.nextInt();
		
		int sum=0;
		int i,j;
		
		for( i=a;i<=b;i++)
		{
			for( j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(j==i)
			{
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println(sum);

	}

}
