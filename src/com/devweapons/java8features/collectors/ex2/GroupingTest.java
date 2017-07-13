package com.devweapons.java8features.collectors.ex2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * The above example is used to demonstrate the :
 * Joining, grouping and averaging collectors 
 *
 */
public class GroupingTest {

	public static void main(String[] args) {
		Map<String, List<Player>> players = getPlayers()
				.stream()
				.collect(Collectors.groupingBy(p -> p.getTeam()));
		players.forEach((team,p) -> System.out.format("Team %s :%s\n",team,p));
		
		//Players age averaging
		Double moyenne = getPlayers()
				.stream()
				.collect(Collectors.averagingInt(d -> d.getAge()));
		System.out.println("age averaging :"+moyenne);
		
		//an example of concatenation 
		String phrase = getPlayers()
				.stream()
				.filter(p -> "RMA".equals(p.getTeam()))
				.map(p -> p.getNom())
				.collect(Collectors.joining(" and ", "In RMA ", " are the best"));
		
		System.out.println(phrase);
	}
	
	private static List<Player> getPlayers() {

		List<Player> result = new ArrayList<Player>();

		result.add(new Player(9, "abbassi", "abdel", "mail@example.com", "RMA",25));
		result.add(new Player(5, "toto", "toto", "mail@example.com", "BCA", 31));
		result.add(new Player(12, "tata", "tata", "mail@example.com", "LIV", 33));
		result.add(new Player(10, "titi", "titi", "mail@example.com", "RMA", 27));
		result.add(new Player(7, "lolo", "lolo", "lolo@example.com", "BCA", 30));

		return result;
	}
}
