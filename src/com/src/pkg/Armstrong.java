package com.src.pkg;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int c=0,sum=0;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the number:  ");
		int n=inp.nextInt();
		int temp=n;
		while(n>0)
		{
			c=n%10;
			n=n/10;
			sum=sum+(c*c*c);
			
		}
		System.out.println("--------------------");
		if(temp==sum) {
		System.out.println("the given entered number is a armstrong number");
		}		
		else	
		{
			System.out.println("the given entered number is not a armstrong number");
		}
	}
	

}
