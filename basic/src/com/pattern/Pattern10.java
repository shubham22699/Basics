package com.pattern;

public class Pattern10 {

	public static void main(String[] args) {
		
		for(int i=0;i<=4;i++)
		{
			char a='A';
			for(int j=1;j<=i;j++)
			{
				
				if(i%2!=0)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(a);
					a++;
				}
				
			}
			System.out.println();
		}

	}

}
