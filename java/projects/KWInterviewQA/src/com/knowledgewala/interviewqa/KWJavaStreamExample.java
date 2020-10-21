package com.knowledgewala.interviewqa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import sun.security.util.Cache.EqualByteArray;

public class KWJavaStreamExample {

	public static void main(String[] args) {

		streamExample();
	}

	public static void streamExample() {

		List<Integer> myList = new ArrayList<Integer>();

		for (int i = 0; i < 100; i++)
			myList.add(i);

		Stream<Integer> seqStream = myList.stream();

		Stream<Integer> parallerStream = myList.parallelStream();

		Stream<Integer> filterByParaller = parallerStream.filter(p -> p > 50);
		System.out.println("\n::: Filter Using Paraller :::");
		filterByParaller.forEach(p -> System.out.print(" " + p));

		Stream<Integer> filterBySequential = seqStream.filter(d -> d > 40);
		
		System.out.println("\n::: Filter Using Sequentials :::");
		filterBySequential.forEach(p -> System.out.print(" "+p));

	}

}
