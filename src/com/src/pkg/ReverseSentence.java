package com.src.pkg;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=inp.nextLine();
		//String str="Java Selenium TestNG";
		String strArray[]=str.split(" ");
		StringBuffer sb=new StringBuffer();
		
		for(String word : strArray)
		{
			//System.out.println("Input word :"  +word);
		
		
		//String word = null;
		sb.append(new StringBuilder(word).reverse());
		sb.append("  ");
		}
		System.out.println(sb + " ");
		

	}

}
