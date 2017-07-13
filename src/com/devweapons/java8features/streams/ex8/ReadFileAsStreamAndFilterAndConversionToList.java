package com.devweapons.java8features.streams.ex8;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;import org.omg.Messaging.SyncScopeHelper;

/**
 * The above example is used to demonstrate the :
 * use of stream api to read, filter and convert a file
 *
 */
public class ReadFileAsStreamAndFilterAndConversionToList {

	public static void main(String args[]) {
		String fileName = "E:\\path\\to\\file.txt";
		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			//1. filter the line 1
			//2. convert it to upper case
			//3. convert the result to List
			
			list = stream
					.filter(line -> line.startsWith("city")) //consider the line start with 'city' word
					.map(String::toUpperCase)
					.collect(Collectors.toList());
			
			list2 = list.stream().map(s ->{
				String[] sTab = s.split(" ");
				return sTab[1]; //will take the second entry
			}).collect(Collectors.toList());

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * file.txt
		 * name abbassi abdlkebir
		 * mail mail@exampl.com
		 * city marrakech
		 */

		list.forEach(System.out::println); //CITY MARRAKECH
		list2.forEach(System.out::println); // MARRAKECH

	}
}
