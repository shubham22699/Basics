package com.writtenTest1_14Feb;

public class SquareCubeSum {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			 int sqr=i*i;
			int cube=sqr*i;
			int sum=sqr+cube;
			System.out.println(sum);
		}
	}

}
