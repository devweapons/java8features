package com.devweapons.java8features.streams.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 
 * The above example is used to demonstrate the :
 * conversion of a List of Objects to a List of Strings using Stream API introduced in Java8
 *
 */
public class ObjectListToStringList {

	public static void main(String[] args) {

        List<Player> players =new ArrayList();
        players.add(new Player(9,"abbassi", "abdelkebir", "aabassi@norsys.fr", "RMA"));
        players.add(new Player(3,"toto", "tata", "toto@norsys.fr", "BCA"));
        players.add(new Player(5,"LIP"));


        //classic way
        List<String> names1 = new ArrayList<>();
        for (Player p : players) {
        	names1.add(p.getNom()!=null?p.getNom():"name unavailable");
        }
        System.out.println(names1);

        //using java8
        List<String> names2 = players.stream().map(x -> x.getNom()!=null?x.getNom():"name unavailable").collect(Collectors.toList());
        System.out.println(names2);
        
        //if you don't like to write it in one line of code :
        
//        List<String> collect = players
//        		.stream()
//        		.map(x -> x.getNom()!=null?x.getNom():"name unavailable")
//        		.collect(Collectors.toList());
//        System.out.println(collect);


    }

}
