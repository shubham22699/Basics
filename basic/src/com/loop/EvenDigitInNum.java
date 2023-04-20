package com.loop;

import java.util.Scanner;

public class EvenDigitInNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				System.out.println(rem);
			}
			num/=10;
		}


	}

}
