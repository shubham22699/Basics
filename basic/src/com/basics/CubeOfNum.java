package com.basics;

import java.util.Scanner;

public class CubeOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		
		int cube=num*num*num;
		System.out.println("cube of "+num+" is :"+cube);
		
		System.out.println("===========================");
		
		

	}

}
