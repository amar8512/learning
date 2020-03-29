package com.noida.learning.java;

import com.noida.learning.LearningPrinter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamClass {

    public static void main(String[] args) {
       /* int arr[] = new int[]{8,2,2,4,4,5,0,9};
        IntStream str = Arrays.stream(arr);

        long num =str.count();
        IntStream str2 = Arrays.stream(arr);
     //   IntStream distinct= str2.distinct();
        LearningPrinter.print(arr);
        int distinctarr[] = str2.distinct().toArray();
        LearningPrinter.print(distinctarr);

        Integer integerArray[] = new Integer[]{0,2,3,4,0,2,9};
        Stream<Integer> strInteger = Arrays.stream(integerArray);
        int arr[] =
        System.out.println(" "+num);*/
        List<Integer> lstArray = Arrays.asList(null,null,null);
        Optional<Integer> maxNum = lstArray.stream().max(Integer::compareTo);

    }
}
