package com.loop;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		
		String ans=" ";
		
		while(num>0)
		{
			int rem=num%2;
			ans=rem+ans;
			num/=2;
		}
		
		System.out.println(ans);
	}

}
