package com.devweapons.java8features.streams.ex7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileLinePerLine {

/**
 * The above example is used to demonstrate the :
 * read of a file line per line as a stream 
 */
	public static void main(String args[]) {

		String fileName = "path\\to\\my_file.txt"; //the path format is tested on windows

		//a file into stream
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
