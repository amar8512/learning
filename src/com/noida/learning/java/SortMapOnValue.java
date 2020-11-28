package com.noida.learning.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class SortMapOnValue {
    public static Map<String, Integer> sortMapBasedOnValue(
            Map<String, Integer> map) {

        /*map = map.entrySet().stream().sorted(comparingByValue()).collect(
                toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                        LinkedHashMap::new));
*/
        map = map.entrySet().stream().sorted(comparingByValue()).collect(
                toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                        LinkedHashMap::new));
        return map;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Three", 3);
        map.put("Two", 2);
        map.put("Four", 4);
        map = sortMapBasedOnValue(map);
        System.out.println(map);

    }
}
