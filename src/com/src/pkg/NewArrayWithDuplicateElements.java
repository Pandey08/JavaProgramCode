package com.src.pkg;

import java.util.Arrays;

public class NewArrayWithDuplicateElements {
	
	public static int gettingDuplicateElements(int a[],int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]==a[i+1])
			{
				temp[j++]=a[i];
				j++;
			}
}
		//temp[j++]=a[n-1];
		for(int i=0;i<j;i++)
		{
			a[i]=temp[i];
		}
		return j;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {1,2,5,4,1,2,5,6};
		int length=arr.length;
		//1,2,5
		Arrays.sort(arr);
		
		System.out.println("sorted array");
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
		
		int len=gettingDuplicateElements(arr,length) ;
		
		System.out.println(len);
		
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i] + " ");
		}
		

	}

}
