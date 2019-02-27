package com.src.pkg;

import java.util.Scanner;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter in the array:  ");
		int num=inp.nextInt();
		
		int numbers[]=new int[num];
		
		for(int i=0;i<num;i++) {
	    System.out.println("number" + i + ":");
        numbers[i]=inp.nextInt();
		}
		int len=numbers.length;
		for(int j=0;j<len;j++)
		{
			for(int k=j+1;k<len;k++)
			{
				if(numbers[j]==numbers[k])
					System.out.println(numbers[j]);
			}
		}
	}
	
	
	

}
