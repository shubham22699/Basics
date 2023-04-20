package com.writtenTest1_14Feb;

import java.util.Scanner;

public class NumFrom1To100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter end number:");
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			if(i%5==0 || i%10==0)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
