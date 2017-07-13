package com.devweapons.java8features.streams.ex6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.devweapons.java8features.streams.ex4.Player;

/**
 * 
 * The above example is used to demonstrate the :
 * conversion of a defined stream to a list
 */
public class StreamToList {

    public static void main(String[] args) {

        Stream<Player> playersStream = Stream.of(new Player(10,"abbassi", "abdel", "abbassi@example.com", "RMA"),
        		new Player(10,"tata", "tata", "tata@example.com", "BCA"),
        		new Player(10,"toto", "toto", "toto@example.com", "LIV"));

        //Convert a Stream to List
        List<Player> result = playersStream.collect(Collectors.toList());

        result.forEach(System.out::println);
        
    }
}
