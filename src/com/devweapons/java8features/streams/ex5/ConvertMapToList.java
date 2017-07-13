package com.devweapons.java8features.streams.ex5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * The above example is used to demonstrate the :
 * conversion of a Map Key to List
 * conversion of a Map Value to List
 *
 */
public class ConvertMapToList {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(10, "java");
        map.put(20, "php");
        map.put(30, "c");
        map.put(40, "python");
        
        System.out.println("\n1. convert Map Key to List...");

        List<Integer> result = map.entrySet().stream()
                .map(x -> x.getKey())
                .collect(Collectors.toList());

        result.forEach(System.out::println);

        System.out.println("\n2. convert Map Value to List...");

        List<String> result2 = map.entrySet().stream()
                .map(x -> x.getValue())
                .collect(Collectors.toList());

        result2.forEach(System.out::println);


    }

}
