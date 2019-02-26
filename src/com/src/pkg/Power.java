package com.src.pkg;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n,p,r=1;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=inp.nextInt();
		System.out.println("Enter the power: ");
		p=inp.nextInt();
		
		if(n>0 && p==0)
		{
			r=1;
		}
		else if(n==0 && p>0)
		{
			r=0;
		}
		else
		{
			for(int i=1;i<=p;i++)
			{
				r=r*n;
			}
		}

		System.out.println("The power of the given number is: "  +r);
	}

}
