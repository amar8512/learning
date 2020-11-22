package com.noida.learning.java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class SortHashMapByValue {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap();
        hm.put("Biscuit",12);
        hm.put("Milk",50);
        hm.put("Noodles",45);
        hm.put("Cell",30);
        hm.put("Oil",10);

       Map<String,Integer> sortedMap= hm.entrySet().stream().sorted(comparingByValue())
               .collect(toMap(e->e.getKey(),e->e.getValue(),(e1,e2)->e2,
                       LinkedHashMap::new));
        System.out.println(sortedMap);
    }
}
