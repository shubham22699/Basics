package com.loop;

import java.util.Scanner;

public class AverageOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		
		while(num>0)
		{
	
			int rem=num%10;
			count++;
		    sum+=rem;
		    num/=10;
		}
		int avg=sum/count;
		
		System.out.println(avg);
		
	}

}
