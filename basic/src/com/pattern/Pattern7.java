package com.pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter rows");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2!=0)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print("0"+" ");
				}
			}
			System.out.println();
		}


	}

}
