package com.noida.learning.ds.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackOverFlow {
    public static List<Double> reverse(ArrayList<Double> arraylist) {
        List<Double> result = Arrays.asList(new Double[arraylist.size()]);
        for(int i=0; i<arraylist.size(); i++) {
            result.set((arraylist.size()) - 1 - i, arraylist.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Double> doubles = new ArrayList<Double>();
        doubles.add(1.5);
        doubles.add(2.3);
        doubles.add(7.7);
        doubles.add(8.6);
        System.out.println(reverse(doubles));
    }
}
