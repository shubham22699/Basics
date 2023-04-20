package com.basics;

import java.util.Scanner;

public class Ternary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		

	    String res=(num<100)?(num>50?"Number is less than 100 and greater than 50":"Number is not between 50 and 100"):("Number is not between 50 and 100");

        System.out.println(res);
	}

}
