package com.noida.learning.ds.leetcode.slidingwindow;

import java.util.HashSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueSubString {
	//using hashmap
	/*public static int findLength(String str) {
		Map<Character, Integer> hm = new HashMap<>();
		int windowStart = 0;
		int windowEnd;
		int max = Integer.MIN_VALUE;
		for (windowEnd = 0; windowEnd < str.length(); ) {
			if (!hm.containsKey(str.charAt(windowEnd))) {
				hm.put(str.charAt(windowEnd), 1);
				max = Math.max(hm.size(), max);
			} else {
				windowStart = windowEnd;
				hm.clear();
			}
			windowEnd++;
		}
		return windowEnd - windowStart > max ?
				windowEnd - windowStart  :
				max;

	}
*/
	public static int findLength(String str) {
	 // int maxLength=0;
	  HashSet<Character> hs = new HashSet();
	  int windowEnd=0;
	  int windowStart=0;
	  int max =Integer.MIN_VALUE;
	  while(windowEnd<str.length()){
	  	if(!hs.contains(str.charAt(windowEnd))){
	  		hs.add(str.charAt(windowEnd));
	  		++windowEnd;
	  	//	max = Math.max(max,windowEnd-windowStart);
		    max =Math.max(max,hs.size());
	    }
	  	else {
          hs.remove(str.charAt(windowStart));
          ++windowStart;
	    }
	  }
	  return max;
	}
	public static void main(String[] args) {
		System.out.println(
				"Length of the longest substring: " + findLength("aabccbb"));
		System.out.println(
				"Length of the longest substring: " + findLength("abbbb"));
		System.out.println(
				"Length of the longest substring: " + findLength("abccde"));
		System.out.println(
				"Length of the longest substring: " +findLength("dvdf"));
		System.out.println(
				"Length of the longest substring: " +findLength("bbbbb"));

	}
}
