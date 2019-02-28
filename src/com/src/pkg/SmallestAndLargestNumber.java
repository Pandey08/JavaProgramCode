package com.src.pkg;

import java.util.Scanner;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner inp=new Scanner(System.in);
		 
		 System.out.println("Enter the number of elements you want to enter in the array:  ");
		 int n=inp.nextInt();
		 
		 int[] arr=new int[n];
		 for(int i=0;i<n;i++) {
			 System.out.println("numbers" +i+ ":");
			 arr[i]=inp.nextInt();
		 }
		 
		 int largest=arr[0];
		 int smallest=arr[0];
		 
		 for(int j=1;j<n;j++)
		 {
			 if(arr[j]>largest)
			 {
				 largest=arr[j];
			 }
			 else if(arr[j]<smallest)
			 {
				 smallest=arr[j];
			 }
		 }
		 
		 System.out.println("the largest is: " +largest);
		 System.out.println("the smallest is: " +smallest);
	}

}
