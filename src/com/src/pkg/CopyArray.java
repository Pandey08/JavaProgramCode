package com.src.pkg;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the size :");
		int size=inp.nextInt();
		
		System.out.println("----------");
		
		int arr1[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("number" + i + ":");
			arr1[i]=inp.nextInt();
		}
		
		System.out.println("----------");
		
		//Elements in the array before copied to other array
		System.out.print("Input Array:  ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr1[i] + " ");
		}
		int len=arr1.length;
		int arr2[]=new int[len];
		System.out.println();
		System.out.println("----------");
		
		for(int i=0;i<len;i++)
		{
			arr2[i]=arr1[i];
		}
		
		//Elements in the second array after copied
		System.out.print("Second Array:  ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr2[i] + " ");
		}
	}

}

/*
 * Enter the size :5
----------
number0:2
number1:4
number2:6
number3:8
number4:9
----------
Input Array:  2 4 6 8 9 
----------
Second Array:  2 4 6 8 9 
 */
