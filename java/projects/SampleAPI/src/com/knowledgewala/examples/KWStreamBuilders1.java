package com.knowledgewala.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class KWStreamBuilders1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Integer[] evenNumberArray = list.stream().filter(p -> p % 2 == 0).toArray(Integer[]::new);

		// System.out.println(evenNumberArray.toString());

		intermediateOpr();

	}

	public static void intermediateOpr() {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekjar");
		memberNames.add("Aman");
		memberNames.add("Josep");
		memberNames.add("Salman");
		memberNames.add("Rohit");
		memberNames.add("Gopal");
		memberNames.add("Zuul");
		memberNames.add("Lockesh");
		memberNames.add("Yamah");
		memberNames.add("XMas");

		// Filter
		memberNames.stream().filter(p -> p.startsWith("A")).forEach(System.out::println);

		// Filter and convert to Upper Case
		memberNames.stream().filter(p -> p.startsWith("S")).map(String::toUpperCase).forEach(System.out::println);
		// Sort the List
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

		// Terminal Opertions
		// forEach
		// collect
		List<String> list = memberNames.stream().sorted().map(String::toLowerCase).collect(Collectors.toList());

		System.out.println(list);

		// match, anymatch, allmatch
		boolean matchedResult = memberNames.stream().anyMatch(s -> s.startsWith("S"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream().allMatch(s -> s.startsWith("S"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream().noneMatch(s -> s.startsWith("S"));

		System.out.println(matchedResult);

		// Count
		long totalMatched = memberNames.stream().filter(p -> p.startsWith("Z")).count();
		System.out.println(totalMatched);

		// reduce
		Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> s1 + "#" + s2);
		reduced.ifPresent(System.out::println);

		String firstMatchedName = memberNames.stream().filter(s -> s.startsWith("S")).findFirst().get();
		System.out.println(firstMatchedName);

		// parallelStream() in place of Stream for parallel processing
		List<Integer> list1 = Arrays.asList(new Integer[]{1,3,4,6,8,10});
		Integer[] evenNumberArr = list1.parallelStream().filter(s -> s%2 == 0).toArray(Integer[]::new);

		System.out.println(evenNumberArr);
		
		List<Integer> ints = IntStream.of(1,2,3,4,5,6)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(ints);
		
		Optional<Integer> max = IntStream.of(1,2,3,4,5,6)
							.boxed()
							.max(Integer::compareTo);
		
		System.out.println(max);
		
		LongStream.of(1,2,3,4,5,6)
					.boxed()
					.collect(Collectors.toList());
		
		DoubleStream.of(1d,2d,3d,4d,5d)
					.boxed()
					.collect(Collectors.toList());
		 
		
			
	}

}
