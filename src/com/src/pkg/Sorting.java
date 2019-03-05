package com.src.pkg;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner inp= new Scanner(System.in) ;
		System.out.println("Enter the number of elements you want in the array: ");
		int num=inp.nextInt();
		
		int arr[]=new int[num];
		for (int i = 0;i < num;i++) {
            System.out.println ("number" + i + ":");
			arr[i]=inp.nextInt();
		}
	
	//Original array before sorting	
	System.out.print("Inputting the array before sorting :");
     for(int j=0;j<num;j++)
    {
    	 
    	   System.out.print(" " + arr[j] + "  ");
    	 
    }
    	  
     System.out.println();
     System.out.println();
	//Arranging the elements in ascending order
      int temp=0;
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	
		//Display the elements in ascending order
		System.out.print("Displaying the elements after sorting:  ");
		for(int i=0;i<num;i++)
		{
			System.out.print(" " + arr[i] + " ");
			
		}
		System.out.println();
		//Printing the 2nd largest element in the array:
	     System.out.println("Printing the 2nd largest element in the array:  " +arr[num-2]);
	     //Printing the largest element in the array
	     System.out.println("Printing the largest element in the array:  " +arr[num-1]);
	   //Printing the 3rd largest element in the array:
	     System.out.println("Printing the 3nd largest element in the array:  " +arr[num-3]);
	     //Printing the smallest element in the array:
}
}
	

