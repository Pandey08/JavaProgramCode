package com.src.pkg;

import java.util.Scanner;

public class DivideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the string:   ");
		String str=inp.nextLine();
		
		 //Stores the length of the string  
		int len=str.length();
		
		//n determines the variable that divide the string in 'n' equal parts 
		System.out.println("Enter the integer: ");
		int n=inp.nextInt();
		
		int temp = 0, chars = len/n;  
		
		 //Stores the array of string  
		String[] equalStr=new String[n];
		
		 //Check whether a string can be divided into n equal parts  
		if(len%n!=0)
		{
			System.out.println("Sorry this string can't be divided into equal" + n +  " parts");
			
		}
		else
		{
			for(int i=0;i<len;i=i+chars)
			{
				String part=str.substring(i, i+chars);
				equalStr[temp]=part;
				temp++;
			}
		}
		System.out.println( n+ " equals part of the given string are :");
		for(int i=0;i<equalStr.length;i++)
		{
			System.out.println(equalStr[i]);
		}
		
		}

}
