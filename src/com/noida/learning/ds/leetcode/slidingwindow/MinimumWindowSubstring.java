package com.noida.learning.ds.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static String findSubstring(String str, String pattern) {
      int start=0;
      int end=0;
      int smallLength=str.length()+1;
      int matched=0;
      int startString=0;
      HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
      for(int i=0;i<pattern.length();i++){
       hm.put(pattern.charAt(i),hm.getOrDefault(pattern.charAt(i),0)+1);
      }
      for(end=0;end<str.length();end++){
          char right=str.charAt(end);
          if(hm.containsKey(right)){
             hm.put(right,hm.get(right)-1);
             if(hm.get(right)>=0){
              matched++;
             }
          }
          while(matched==pattern.length()){
              if(smallLength>end-start+1){
                  smallLength=end-start+1;
                  startString=start;
              }
              char left=str.charAt(start++);
              if(hm.containsKey(left)){
                 if(hm.get(left)==0){
                     matched--;
                 }
                 hm.put(left,hm.get(left)+1);
              }
          }
      }
      return smallLength>str.length()?"":str.substring(startString,startString+smallLength);
    }

    public static void main(String[] args) {
     System.out.println(MinimumWindowSubstring.findSubstring("aabdec", "abc"));
        System.out.println(MinimumWindowSubstring.findSubstring("abdbca", "abc"));
        System.out.println(MinimumWindowSubstring.findSubstring("adcad", "abc"));
    }
}
