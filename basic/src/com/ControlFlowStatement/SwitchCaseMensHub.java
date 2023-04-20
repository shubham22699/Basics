package com.ControlFlowStatement;

import java.util.Scanner;

public class SwitchCaseMensHub {
	public static void main(String[] args) 
	{
		Scanner f=new Scanner(System.in);
		System.out.println("----WELCOME----");

		System.out.println("Please select what u want:");
		System.out.println("1 Shirts");
		System.out.println("2 Pants");

		int clothes=f.nextInt();

		switch(clothes)
		{
               case 1:
			{
				System.out.println("Our shop specially known for shirts");
				System.out.println("Please select size:");
				System.out.println("1 M");
				System.out.println("2 L");
				System.out.println("3 XL");
				System.out.println("4 XXL");

				int size=f.nextInt();

				switch(size)
				{
					case 1:
					
						System.out.println("M size is available");
						System.out.println("Prizes start from 300rs. ");
						break;
					
					case 2:
					
						System.out.println("L size is available");
						System.out.println("Prizes start from 400rs");
						break;
					
					case 3:
					
						System.out.println("XL size is available but minimum quantity is left...Hurry up");
						System.out.println("Prizes start from 500rs. ");
						break;
					
					case 4:
					
						System.out.println("XXL size is not available");
						break;
					
				}
				break;
			}
			
               case 2:
			{
				System.out.println("Our shop specially known for Jeans pants");
				System.out.println("Please select size:");
				System.out.println("1 30 and 32");
				System.out.println("2 34 and 36");
				System.out.println("3 36 and above ");

				int pant=f.nextInt();

				switch(pant)
				{
					case 1:
					
						System.out.println(" Your selected size is available in different formats");
							System.out.println("prizes starts from 600rs");
							break;
					
					case 2:
					
						System.out.println(" size is available");
						System.out.println("Prizes start from 800rs");
						break;
						
					case 3:
					
						System.out.println(" size is available");
						System.out.println("this sizes are not available in different formats");
						break;
					
				}
				break;

			}
			
			default:
		    {
			  System.out.println("please select valid input");
		    }
		
	   }
		


    }
}
