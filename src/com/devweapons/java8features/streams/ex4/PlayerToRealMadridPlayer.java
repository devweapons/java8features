package com.devweapons.java8features.streams.ex4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * The above example is used to demonstrate the :
 * conversion of a List of objects to a list of other objects
 *
 */
public class PlayerToRealMadridPlayer {

	public static void main(String[] args) {

        List<Player> players = Arrays.asList(
        		new Player(10,"abbassi", "abdel", "abbassi@example.com", "RMA"),
                new Player(5, "toto", "tata", "toto@example.com", "BCA")
        );

		// conversion done inside the map() method.
        List<RealMadridPlayer> result = players.stream().map(temp -> {
        	RealMadridPlayer obj = new RealMadridPlayer();
            obj.setNom(temp.getNom());
            obj.setPrenom(temp.getPrenom());
            if ("abbassi".equals(temp.getNom())) {
                obj.setPrime(250);
            }
            return obj;
        }).collect(Collectors.toList());

        System.out.println(result);
        //[com.codedarea.javarea.streams.ex4.RealMadridPlayer@..., com.codedarea.javarea.streams.ex4.RealMadridPlayer@...]

    }
}
