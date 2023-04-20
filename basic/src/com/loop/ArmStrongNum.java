package com.loop;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=s.nextInt();
		int temp=num;
		
		int count=count(num);
		
		int sum=0;
		
		while(num>0)
		{
			int rem=num%10;
			sum=sum+power(rem,count);
			num/=10;
		}
		if(temp==sum)
		{
			System.out.println("It is ArmStrong Number");
		}
		else
		{
			System.out.println("It is Not ArmStrong Number");
		}
	}
	
	public static int count(int n)
	{
		int count=0;
		
		while(n>0)
		{
			n/=10;
			count++;
		}
		return count;
	}
	
	public static int power(int b,int r)
	{
		int pow=1;
		for(int i=1;i<=r;i++)
		{
			pow*=b;
		}
		return pow;
	}

}
