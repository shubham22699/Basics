package com.WrittenTest_2;

public class Q4_Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j%2!=0)
				{
					System.out.print("1"+" ");
				}
				else
				{
					System.out.print("0"+" ");
				}
				
			}
			System.out.println();
		}

	}

}
