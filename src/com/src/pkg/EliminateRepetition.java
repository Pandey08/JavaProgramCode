package com.src.pkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EliminateRepetition {
	
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of the elements you want in the array");
		int num=sc.nextInt();
		
		int numbers[]=new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.print("number" + i + ":");
			numbers[i]=sc.nextInt();
			
		}
    
		System.out.print("Input array : ");
		for(int i=0;i<num;i++)
		{
			System.out.print(numbers[i]+ " ");
		}
		
		int temp=0;
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(numbers[i]> numbers[j])
				{
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("array after sorting: ");
		for(int i=0;i<num;i++)
		{
			System.out.print(numbers[i]+ " ");
		}
		System.out.println();
		System.out.print("array after eliminating the redundancy: ");
		int length = numbers.length; 
		length = removeDuplicateElements(numbers, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(numbers[i]+" ");  
		
		
		
	}

}
