package com.devweapons.java8features.optionals.ex1;

import java.util.Optional;

/**
 * 
 * Optional.isPresent() return true if the optional is not empty.
 * Optional.isPresent() perform the given action on the optional if is not empty.
 *
 */
public class OptionalIfPresentExample {

    public static void main(String[] args) {

        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        if (gender.isPresent()) {
            System.out.println("Value available.");
        } else {
            System.out.println("Value not available.");
        }

        gender.ifPresent(g -> System.out.println("In gender Option, value available."));

        //no output
        emptyGender.ifPresent(g -> System.out.println("In emptyGender Option, value available."));

    }

}