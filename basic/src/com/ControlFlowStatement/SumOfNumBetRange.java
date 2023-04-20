package com.ControlFlowStatement;

import java.util.Scanner;

public class SumOfNumBetRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter end number:");
		int b=sc.nextInt();
		
		int sum=0;
		
		for(int i=a;i<=b;i++)
		{
			sum+=i;
		}
		System.out.println(sum);

	}

}
