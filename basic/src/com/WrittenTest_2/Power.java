package com.WrittenTest_2;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);

		System.out.println("Enter base value:");
		int b=p.nextInt();

		System.out.println("Enter raise value:");
		int r=p.nextInt();

		int power=1;

		for(int i=0;i<r;i++)
		{
			power*=b;
		}

		System.out.println("Power of "+b+"^"+r+" is: "+power);

	}

}
