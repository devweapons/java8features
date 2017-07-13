package com.devweapons.java8features.collectors.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * 
 * The above example is used to demonstrate the :
 * concatenation of a list of string
 *
 */
public class CollectorsAndJoiningExample {

	public static void main(String[] args) {
		
	List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");

	//java | python | nodejs | ruby
	String result1 = list.stream().map(x -> x).collect(Collectors.joining(" | "));
	System.out.println(result1);
	
	//aaa,bbb,ccc
	StringJoiner sj = new StringJoiner(",");
    sj.add("aaa");
    sj.add("bbb");
    sj.add("ccc");
    String result2 = sj.toString(); 
    System.out.println(result2);
    
   
    //prefix-2016/02/26-suffix
    StringJoiner sj1 = new StringJoiner("/", "prefix-", "-suffix");
    sj1.add("2016");
    sj1.add("02");
    sj1.add("26");
    String result3 = sj1.toString();
    System.out.println(result3);
    
	}
}
