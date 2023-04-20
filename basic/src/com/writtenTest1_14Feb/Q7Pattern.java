package com.writtenTest1_14Feb;

public class Q7Pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
