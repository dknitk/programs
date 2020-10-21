package com.knowledgewala.examples;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class KWStreamAPIExample {

	public static void main(String[] args) {
		// Stream.of()
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		stream.forEach(p -> System.out.print(p + " , "));

		System.out.println();
		// Stream from Array
		Stream<Integer> stream1 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });

		stream1.forEach(System.out::print);

		// Stream from List
		System.out.println();

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		
		Stream<Integer> stream2 = list.stream();
		list.forEach(p -> System.out.print(p));
		
		// Stream generate infine loop
		//Stream<java.util.Date> stream3 = Stream.generate(() ->{return new java.util.Date();});
		//stream3.forEach(p -> System.out.println(p));
		
		// Stream chars or String token
		IntStream stream4 = "12345_abcdefg".chars();
		stream4.forEach(p -> System.out.println(p));
		
		Stream<String> stream5 = Stream.of("A$B$C".split("\\$"));
		stream5.forEach(p -> System.out.println(p));
		
		// Convert Stream to Collections Example
		
		
	}

}
