package com.noida.learning.ds.leetcode;

import java.util.HashMap;

public class LongestSubStringWithMUnique {
    public static int findLength(String str, int k) {
        HashMap<Character,Integer> countOfChars = new HashMap<>();
        int left=0 ,right=0,max=0;
        for(right=0;right<str.length();right++){
            if(countOfChars.containsKey(str.charAt(right))){
                countOfChars.put(str.charAt(right),countOfChars.get(str.charAt(right))+1);
            }
            else{
                countOfChars.put(str.charAt(right),1);

            }
            while(countOfChars.size()>k){
                countOfChars.put(str.charAt(left),countOfChars.get(str.charAt(left))-1);
                if(countOfChars.get(str.charAt(left)) ==0 ){
                    countOfChars.remove(str.charAt(left));
                }
                ++left;
            }
            max = Math.max(max,right-left+1);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(findLength("araaci", 2));
    }
}
