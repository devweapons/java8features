package com.devweapons.java8features.lambdas.ex1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * The above example is used to demonstrate the :
 * sort of a list of objects using lambda expressions
 *
 */
public class TestSortingWithLambda {

	public static void main(String[] args) {

		List<Player> players = getPlayers();

		System.out.println("------Before Sort");
		for (Player player : players) {
			System.out.println(player.getNom());
		}

		System.out.println("------After Sort");

		//lambda here!
		players.sort((Player p1, Player p2)->p1.getNumber()-p2.getNumber() );
		
		//java 8 only, lambda also, to print the List
		System.out.println("--ascendant Sort");
		players.forEach((player)->System.out.println(player.getNom()));
				
		// revert ordre
		List<Player> players2 = getPlayers();
		Comparator<Player> numberComparator = (p1, p2)->p2.getNumber()-p1.getNumber();
		players2.sort(numberComparator);
		System.out.println("--descendant Sort");
		players2.forEach((player)->System.out.println(player.getNom()));

	}

	private static List<Player> getPlayers() {

		List<Player> result = new ArrayList<Player>();

		result.add(new Player(9, "abbassi", "abdel", "mail@example.com", "RMA"));
		result.add(new Player(5, "toto", "toto", "mail@example.com", "BCA"));
		result.add(new Player(12, "tata", "tata", "mail@example.com", "LIV"));
		result.add(new Player(10, "titi", "titi", "mail@example.com", "SEV"));

		return result;
	}

}