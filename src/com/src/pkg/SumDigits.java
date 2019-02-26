package com.src.pkg;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the digit:  ");
		long n=input.nextLong();
		System.out.println("The sum of the digits is: " +sumDigits(n));

	}
	
	public static int sumDigits(long n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=(int) (sum+n%10);
			n=n/10;
		}
		return sum;
	}

}
