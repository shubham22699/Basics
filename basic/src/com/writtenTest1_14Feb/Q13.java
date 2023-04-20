package com.writtenTest1_14Feb;

public class Q13 {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=5)
			{
				if(j==2) {
					System.out.println(j);
					break;
				}
				j++;
			}
			System.out.println(i);
			i++;
		}

	}

}
