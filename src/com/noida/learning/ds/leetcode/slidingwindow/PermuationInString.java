package com.noida.learning.ds.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;

public class PermuationInString {

    public boolean findPermutation(String s1, String s2) {

        int lengthString = s1.length();
        int lengthPattern = s2.length();
        int startPointer = 0;
        int endPointer;
        int count = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        char c;
        for (int i = 0; i < lengthPattern; i++) {
            c = s2.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for(endPointer=0;endPointer<lengthString;endPointer++){
            char rightChar = s1.charAt(endPointer);
            if(hm.containsKey(rightChar)){
                hm.put(rightChar,hm.get(rightChar)-1);
                if(hm.get(rightChar)==0){
                    ++count;
                }
            }
           if( count == hm.size())
               return  true;

           if(endPointer>=s2.length()-1){
               char leftChar = s1.charAt(startPointer++);
               if(hm.containsKey(leftChar)){
                   if(hm.get(leftChar)==0){
                       count--;
                   }
                   hm.put(leftChar,hm.get(leftChar)+1);
               }
           }
        }
        return false;
    }

    public static void main(String[] args) {
    /*    System.out.println("Permutation exist: " + new PermuationInString()
                .findPermutation("oidbcaf", "abc"));
        System.out.println("Permutation exist: " + new PermuationInString()
                .findPermutation("odicf", "dc"));*/
      if(""==""){
          System.out.println("Equal");
      }
    }
}
