package com.loop;

import java.util.Scanner;

public class DivisibleBy3And9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter ending number:");
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			System.out.println(i);
			if(i%3==0 || i%9==0)
			{
				break;
			}
		}
		


	}

}
