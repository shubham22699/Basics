package com.nestedLoop;

import java.util.Scanner;

public class AutoMorphicNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int temp=num;
		
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		num=temp;
		
		int p=1;
		for(int i=1;i<=count;i++)
		{
			p*=10;
		}
		
		int sqr=num*num;
		
		int rem=sqr%p;
		
		if(rem==num)
		{
			System.out.println("It is Automorphic number");
		}
		else
		{
			System.out.println("It is not Automorphic number");
		}

	}

}
