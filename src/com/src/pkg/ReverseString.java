package com.src.pkg;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the first string:  ");
		char[] arr=inp.nextLine().toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Enter the second string:  " );
		String s=inp.nextLine();
		String rev="";
		int len=s.length();
		for(int i=len-1;i>0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	

}
