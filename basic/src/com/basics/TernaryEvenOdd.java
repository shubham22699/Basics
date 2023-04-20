package com.basics;

import java.util.Scanner;

public class TernaryEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=s.nextInt();
		
		String res=num>0?"Positive":"Negative";
		
		System.out.println("Number is "+res);

	}

}
