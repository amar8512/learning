package com.noida.learning.ds.gfg;

import java.util.HashMap;

public class EqualZeroOne {
    static int maxLen(int[] arr, int N) {
        int max = 0;
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count = count + 1;
            } else {
                count = count - 1;
            }
            if(hm.containsKey(count)){
                max= Math.max(max,i-hm.get(count));
            }
            else{
                hm.put(count,i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxLen(new int[] { 1,1,1,0,0 }, 5));
    }
}
