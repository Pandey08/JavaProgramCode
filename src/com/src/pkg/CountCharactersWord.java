package com.src.pkg;

import java.util.Scanner;

public class CountCharactersWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the sentence:  ");
		String sen=inp.nextLine();
		int count=0;
		
		int len=sen.length();
		
		for(int i=0;i<len;i++)
		{
			if(sen.charAt(i)!=' ')
				count++;
		}
      System.out.println(count);
	}

}
