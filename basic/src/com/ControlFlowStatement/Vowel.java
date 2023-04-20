package com.ControlFlowStatement;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Alphabet:");
		char alpha=sc.next().charAt(0);
		
		switch(alpha)
		{
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
		case'A':
		case'E':
		case'I':
		case'O':
		case'U':
		System.out.println("It is a vowel");
			break;	
		default:
		
			System.out.println("It is a Constant");

		}


	}

}
