package com.devweapons.java8features.optionals.ex1;

import java.util.Optional;

/**
 * Advantages of Optionals in Java 8 :
 * no need to check Null values and NullPointerException
 * no more NullPointerException at run-time
 * the code become more clean
 * 
 */
public class OptionalBasicExample {

    public static void main(String[] args) {

        Optional<Integer> wheight = Optional.of(86);
        Integer answer1 = 80;
        Integer answer2 = null;

        System.out.println("Non-Empty Optional:" + wheight);
        System.out.println("Non-Empty Optional: wheight value : " + wheight.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

        // java.lang.NullPointerException
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));

    }

}