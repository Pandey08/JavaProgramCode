package com.src.pkg;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=1,num;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the number:  ");
		num=inp.nextInt();
		System.out.println("The factorial of the given number is :" +factorial(num));

	}
	
	public static int factorial(int num )
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
