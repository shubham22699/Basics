package com.writtenTest1_14Feb;

public class Q6Pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<4;j++)
			{
				System.out.print(" ");
			}
		    for(int j=1;j<=(i*2)-1;j++)
		    {
		    	System.out.print(i);
		    }
		    System.out.println();
		}
	}

}
