package com.nestedLoop;

import java.util.Scanner;

public class Table1to5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b=sc.nextInt();
		
		
		for(int i=a;i<=b;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(j*i+" ");
			}
			System.out.println();
		}


	}

}
