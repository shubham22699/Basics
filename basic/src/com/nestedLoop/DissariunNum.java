package com.nestedLoop;

import java.util.Scanner;

public class DissariunNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		
		
		int count=0;
		
		while(num>0)
		{
			count++;
			num/=10;
		}
		
		num=temp;
		
		while(num>0)
		{
			int rem=num%10;
			int p=1;
			for(int i=1;i<=count;i++)
			{
				p*=rem;
			}
			sum+=p;
			count--;
			num/=10;
		}
		num=temp;
		if(num==sum)
		{
			System.out.println("It is Dissarium number");
		}
		else
		{
			System.out.println("It is not Dissarium number");
		}
		
	}

}
