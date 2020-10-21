package com.knowledgewala.examples;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class KWJavaStreams {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello, Welcome to Streams Programming!");
		sample14();
	}
	public static void sample14() throws IOException {
		IntSummaryStatistics summary = IntStream.of(7,3,17,34,45,23,10)
				.summaryStatistics();
		System.out.println(summary);
	}
	
	public static void sample13() throws IOException {
		
		double total = Stream.of(7.3, 1.5, 4.8)
					.reduce(0.0, (Double a, Double b) -> a+b);
		System.out.println("Total ="+ total);
		
	}
	
	public static void sample12() throws IOException {
		Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
		Map<String, Integer> map = new HashMap<>();
		
		map = rows1
				.map(x -> x.split(","))
				.filter(x -> x.length == 3)
				.filter(x -> Integer.parseInt(x[1]) >15)
				.collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[1])));
		rows1.close();
		for(String key : map.keySet()) {
			System.out.println(key + " "+map.get(key));
		}
		
		//rows1.forEach(x -> System.out.println(x));
				
	}
	public static void sample11() throws IOException {
		Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
		rows1
			.map(x -> x.split(","))
			.filter(x -> x.length == 3)
			.filter(x -> Integer.parseInt(x[1]) > 12)
			.forEach(x -> System.out.println(x[0] + " "+x[1]+" "+x[2]));
		
		rows1.close();
	}
	
	public static void sample10() throws IOException {
		Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
		int rowCount = (int) rows1
						.map(x -> x.split(","))
						.filter(x -> x.length == 3)
						.count();
		System.out.println(rowCount);
		System.out.println();
		
		//rows1.forEach(x->System.out.println(x));
		
		rows1.close(); 
	}
	
	public static void sample9() throws IOException {
		List<String> bands2 = Files.lines(Paths.get("bands.txt"))
				.filter(x -> x.contains("sdf"))
				.collect(Collectors.toList());
		
		bands2.forEach(x -> System.out.println(x));
		System.out.println();
	}
	public static void sample8() throws IOException {
		
		Stream<String> bands = Files.lines(Paths.get("bands.txt"));
		
		bands.sorted()
			.filter(x -> x.length() >13)
			.forEach(System.out::println);
		
		bands.close();
			
		
	}
		

	public static void sample7() {
		List<String> people = Arrays.asList("Ram", "Shyam", "Balram", "Kuldeep", "Ashok", "Arvind", "Ajay");
		people.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);

	}

	public static void sample6() {
		Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x * x).average().ifPresent(System.out::println);

	}

	public static void sample5() {
		String[] names = { "Ram", "Shyam", "Balram", "Kuldeep", "Ashok", "Arvind", "Ajay" };
		Arrays.stream(names).filter(x -> x.startsWith("R")).sorted().forEach(System.out::println);
	}

	public static void sample4() {

		Stream.of("Raj", "Kumar", "Vishal", "Rajesh").sorted().findFirst().ifPresent(System.out::println);

	}

	public static void sample3() {
		System.out.println(IntStream.range(1, 5).sum());
		// .forEach(x -> System.out.println(x));
	}

	public static void sample2() {
		IntStream.range(1, 10).skip(8).forEach(x -> System.out.println(x));
	}

	public static void sample1() {

		IntStream.range(1, 10).forEach(System.out::print);

		System.out.println();

	}

}
