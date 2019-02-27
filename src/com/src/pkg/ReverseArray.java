package com.src.pkg;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number of element you want to enter in array:  ");
		int num=input.nextInt();
		
		int numbers[]=new int[num];
		
		for(int i=0;i<num;i++)
		{
			System.out.println("number" + i +  ":");
			numbers[i]=input.nextInt();
		}
     
		int len=numbers.length;
		System.out.print("The array in actaul order: " );
		for(int j=0;j<len;j++)
		{
			
			System.out.print(numbers[j] +"  ");
		}
		System.out.println(" ");
		System.out.print("The array in reverse order: ");
		for(int k=len-1;k>=0;k--)
		{
			System.out.print(numbers[k] +"  ");
		}
	}

}
