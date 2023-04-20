package com.loop;

import java.util.Scanner;

public class DivisibleUsingContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter ending number:");
		int b=sc.nextInt();
		

		for(int i=a;i<=b;i++)
		{
			if(i%3!=0)
			{
				System.out.println(i);
				//continue;
			}
		}
	}

}
