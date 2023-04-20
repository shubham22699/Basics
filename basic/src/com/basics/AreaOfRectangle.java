package com.basics;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter width  of rectangle:");
		int w=s.nextInt();
		
		System.out.println("Enter length of rectangle:");
		int l=s.nextInt();
		
		System.out.println("Area of rectangle is :"+(w*l));

	}

}
