package com.noida.learning;

import java.util.ArrayList;
import java.util.Scanner;

public class ClosestProduct {

	public static int findClosestProduct(int num[], int target) {
         
		int nearst;
		
		for (int i = 0; i < num.length; i++) {
            for(int j=i+1;j<num.length;j++){
              largest=arr[i] *arr[i]            	
            }
		}
		return 0;

	}

	public static void main(String args[]) {
        int arr[]=new int[10];
        int nearsetElement = 0;
        
        Scanner scan =new Scanner(System.in);
        
        System.out.println("Enter the elements in the array:");
        
        for(int i=0;i<arr.length;i++){
        	arr[i] = scan.nextInt();
        }
        
        nearsetElement = findClosestProduct(arr,nearsetElement);
        
	}
}
