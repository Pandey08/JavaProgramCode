package com.src.pkg;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Input a word:  ");
		String word=inp.nextLine();
		word.trim();
		String rev="";
		char[] ch=word.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
		   rev=rev+ch[i]	;
		}
		System.out.println("The reverse of the word is:  " +rev.trim());

	}

}
