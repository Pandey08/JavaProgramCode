package com.src.pkg;

import java.util.Scanner;

public class CountVowelConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp= new Scanner(System.in);
		
		System.out.println("Enter the string:   ");
		String str=inp.nextLine();
		int vCount=0,cCount=0;
		
		int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vCount++;
			}
			else if(str.charAt(i)>'a' && str.charAt(i)<'z') 
			{
				cCount++;
			}
		}
   System.out.println(" The vowel count count of the given string is: " +vCount);
   System.out.println(" The consonants count of the given string is: " +cCount);
	}

}
