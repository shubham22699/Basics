package com.basics;

import java.util.Scanner;

public class MaxByTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b=sc.nextInt();
		System.out.println("Enter Third number:");
		int c=sc.nextInt();

	    int greater=(a>b)?(a>c?a:c):(b>c?b:c);
		             

		System.out.println(greater+" is greater");

	}

}
