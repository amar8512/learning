package com.noida.learning.ds.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAnagrams {
    public static List<Integer> findAnagrams(String s,String p){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<p.length();i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        }
        int count=0;
        int endPointer,startPointer=0;
        List<Integer> l = new ArrayList<>();
        for(endPointer=0;endPointer<s.length();endPointer++){
          if(map.containsKey(s.charAt(endPointer))){
              map.put(s.charAt(endPointer),map.get(s.charAt(endPointer))-1);
              if(map.get(s.charAt(endPointer))==0){
                      ++count;
              }
          }
          if(count==map.size()){
              l.add(startPointer);
          }
         if(endPointer>=p.length()-1){
             char leftChar= s.charAt(startPointer++);
             if(map.containsKey(leftChar)){
                 if(map.get(leftChar)==0)
                    --count;

                 map.put(leftChar,map.get(leftChar)+1);
             }
         }
        }
     return l;
    }
    public static void main(String[] args) {
        System.out.println(FindAnagrams.findAnagrams("ppqp", "pq"));
        System.out.println(FindAnagrams.findAnagrams("abbcabc", "abc"));
    }
}
