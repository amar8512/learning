package com.noida.learning.ds;

public class StringAndArray {

    public String solution(String s,int arr[]){
        String p="";
        int value =arr[0];
        p=p+s.charAt(0);
        while(value!=0){
            p=p+s.charAt(value);
             value=arr[value];
        }
        return p;
    }
    public static void main(String[] args){
      String output=  new StringAndArray().solution("bytdag ",new int[]{4,3,0,1,2,5});
        System.out.println(output);
    }
}
