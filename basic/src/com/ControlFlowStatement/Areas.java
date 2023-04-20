package com.ControlFlowStatement;

import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your choice to calculate area:");
		System.out.println("1.Rectangle\n 2.Circle\n 3.Triangle\n 4.Square");
		
		String part=s.next();
		
		switch(part)
		{
		case"Rectangle":
		{
			System.out.println("Enter length:");
			int l=s.nextInt();
			System.out.println("Enter bredth");
			int b=s.nextInt();
			
			System.out.println("Area of Rectangle is : "+l*b);
			break;
		}
		case"Circle":
		{
			System.out.println("Enter radius: ");
			int r=s.nextInt();
			
			System.out.println("Area of circle is: "+(3.14*r*r));
			break;
		}
		case"Triangle":
		{
			System.out.println("Enter height of triangle:");
			int h=s.nextInt();
			System.out.println("Enter base of triangle:");
			int b=s.nextInt();
			
			System.out.println("Area of triangle is: "+(0.5*b*h));
            break;
		}
		case"Square":
		{
			System.out.println("Enter side of square:");
			int a=s.nextInt();
			
			System.out.println("Area of Square is: "+a*a);
			break;
		}
		}

	}

}
