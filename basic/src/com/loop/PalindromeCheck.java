package com.loop;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		
		int num=sc.nextInt();
		
		int temp=num;
		
		int rev =0;
		
		while(temp>0)
		{
			int rem=temp%10;
			rev=(rev*10)+rem;
			temp/=10;
		}
		if (num==rev)
		{
			System.out.println(num +" is palindrome number");
		}
		else
		{
			System.out.println(num+" is not palindrome number");
		}

	}

}
