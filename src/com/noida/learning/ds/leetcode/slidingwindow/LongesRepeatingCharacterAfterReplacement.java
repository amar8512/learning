package com.noida.learning.ds.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;

public class LongesRepeatingCharacterAfterReplacement {

    public static int characterReplacement(String s, int k) {
        int replaceCounter = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        int maxLength = 0;
        int windowStart = 0, windowEnd = 0;
        int maxCountRepeatable=0;
        for (windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightValue = s.charAt(windowEnd);
            hm.put(rightValue, hm.getOrDefault(rightValue, 0) + 1);
            maxCountRepeatable = Math.max(maxCountRepeatable,hm.get(rightValue));
            if(windowEnd-windowStart+1-maxCountRepeatable>k){
                char leftChar = s.charAt(windowStart);
                hm.put(leftChar,hm.get(leftChar)-1);
                windowStart++;
            }
            maxLength = Math.max(windowEnd-windowStart+1,maxLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(LongesRepeatingCharacterAfterReplacement.characterReplacement("aabccbb", 2));
        System.out.println(LongesRepeatingCharacterAfterReplacement.characterReplacement("abbcb", 1));
        System.out.println(LongesRepeatingCharacterAfterReplacement.characterReplacement("abccde", 1));
        System.out.println(LongesRepeatingCharacterAfterReplacement.characterReplacement("aaaa", 1));
    }
}
