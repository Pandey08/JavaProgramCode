package com.src.pkg;

import java.util.Scanner;

public class AllSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=inp.nextLine();
		
		int len = str.length();  
        int temp = 0;  
        //Total possible subsets for string of size n is n*(n+1)/2  
        String arr[] = new String[len*(len+1)/2];  
        
      //This loop maintains the starting character  
        for(int i = 0; i < len; i++) {  
            //This loop adds the next character every iteration for the subset to form and add it to the array  
            for(int j = i; j < len; j++) {  
                arr[temp] = str.substring(i, j+1);  
                temp++;  
            }  
        }  
        
        System.out.println(" All possible substring for the given string are :");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        	
        }
		System.out.println(arr.length);
	}

}
