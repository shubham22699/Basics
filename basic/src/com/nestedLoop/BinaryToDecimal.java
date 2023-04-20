package com.nestedLoop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter binary number:");
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		int m;
		while(num>0)
		{
			int rem=num%10;
			sum+=(rem*power(2,count));
			count++;
			num/=10;
		}
		System.out.println(sum);
	}
	
	public static int power(int b,int r )
	{
		int p=1;
		for(int i=1;i<=r;i++)
		{
			p*=b;
		}
		return p;
	}

}
