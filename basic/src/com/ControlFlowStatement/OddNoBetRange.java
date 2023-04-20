package com.ControlFlowStatement;

import java.util.Scanner;

public class OddNoBetRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter ending number:");
		int b=sc.nextInt();
		
		int sum=0;
		int count=0;
		
		for(int i=a;i>=b;i--)
		{
			if(i%2!=0)
			{
				count++;
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println(sum);
		System.out.println("Count of odd numbers: "+count);

	}

}
