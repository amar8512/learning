package com.noida.learning.ds.hackerrank;

import com.noida.learning.LearningPrinter;

import java.util.ArrayList;
import java.util.Arrays;

public class Closest_Numbers {

    static int[] closestNumbers(int[] arr) {
       long diff =Integer.MAX_VALUE;
        Arrays.sort(arr);
        ArrayList<Integer> al = new ArrayList();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]<=diff){
                diff=arr[i+1]-arr[i];
            }
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==diff){
              al.add(arr[i]);
              al.add(arr[i+1]);
            }
        }
        return al.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        //int arr[] = new int[]{5,4,3,2};
        int arr[] = new int[]{-20,-3916237,-357920,-3620601,7374819,-7330761,30,6246457,-6461594,266854,-520,-470 };
        LearningPrinter.print(closestNumbers(arr));
    }
}
