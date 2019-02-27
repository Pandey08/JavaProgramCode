package com.src.pkg;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the first string:  ");
		String str1=inp.nextLine();
		System.out.println("Enter the second string:  ");
		String str2=inp.nextLine();
		
		 //Converting both the string to lower case.  
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		 //Checking for the length of strings  
		if(str1.length()!=str2.length())
		{
			System.out.println("Both the strings are not anagram");
		}
		
		else
		{
			 //Converting both the arrays to character array  
			char[] arr1=str1.toCharArray();
			char[] arr2=str2.toCharArray();
			
			//Sorting the arrays using in-built function sort ()  
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			 //Comparing both the arrays using in-built function equals ()  
			if(Arrays.equals(arr1, arr2))
			{
				System.out.println("Both the strings are anagram");
			}
			else
			{
				System.out.println("Both the strings are not anagram");
			}
		}

	}

}
