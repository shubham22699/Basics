package com.WrittenTest_2;

import java.util.Scanner;

public class FrequencyOfDigit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile number:");
		long mob=sc.nextLong();
		long temp=mob;
		
				
		while(mob>0)
		{
			int count=0;

			int rem1=(int) (mob%10);
			while(temp>0)
			{
				int rem2=(int)(temp%10);
				if(rem1==rem2)
				{
					count++;
				}
				temp/=10;
			}
			mob=(int)mob/10;
			System.out.println("Count of "+rem1+" is :"+count);

		}
		
	}

}
