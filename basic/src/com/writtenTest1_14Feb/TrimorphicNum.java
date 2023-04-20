package com.writtenTest1_14Feb;

import java.util.Scanner;

public class TrimorphicNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		int cube=num*num*num;
		
		int rem=cube%10;
		
		if(rem==num)
		{
			System.out.println("The number is Trimorphic number");
		}
		else
		{
			System.out.println("The Number is Not Trimorphic number");
		}


		}

}
