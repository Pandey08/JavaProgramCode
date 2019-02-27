package com.src.pkg;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input=new Scanner(System.in);
		System.out.println ("how many number you want to put in the pot?");
        int num = input.nextInt();
        int numbers[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println ("number" + i + ":");
            numbers[i] = input.nextInt();

	}
	
        int len=numbers.length;
        int sum=0;
        for(int j=0;j<len;j++)
        {
        	  sum=sum+numbers[j];
        }
     
        System.out.println("");
        
        System.out.println("The sume of the elements of an array is: " +sum);

}
}