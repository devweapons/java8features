package com.devweapons.java8features.streams.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * The above example is used to demonstrate the :
 * conversion of a List to an other list without null values
 * (filter a null value in a List)
 *
 */
public class FilterNullValueFromStream {

    public static void main(String[] args) {

        List<String> languages = Arrays.asList("java", "python", "node", null, "ruby", null, "php");

        List<String> result = languages.stream().filter(x -> x!=null).collect(Collectors.toList());

        result.forEach(System.out::println);
        System.out.println(result);


    }
}