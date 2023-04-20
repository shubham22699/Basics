package com.pattern;

public class Pattern8 {

	public static void main(String[] args) {
		
		for(char i='A';i<='D';i++)
		{
			for(char j='A';j<='D';j++)
			{
				if(i=='A' || i=='D'||j=='A'||j=='D')
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}


	}

}
