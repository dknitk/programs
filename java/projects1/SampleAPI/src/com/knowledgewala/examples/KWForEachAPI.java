package com.knowledgewala.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class KWForEachAPI {

	public static void main(String[] args) {
		System.out.println("***** ForEach Loop Example *****");

		List<String> names = Arrays.asList("Alex", "Banana", "Manago", "Charles");
		// names.forEach(System.out::println);
		// names.forEach(x -> System.out.println(x));

		Consumer<String> makeUpperCase = new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t.toUpperCase());
			}
		};
		
		Consumer<String> makeUpperCase1 = new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t.toLowerCase());
			}
		};
		
		Consumer<String> makeUpperCase2 = new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t.toCharArray().length);
			}
		};
		names.forEach(makeUpperCase2);
		
		// ForEach for Map
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "Alex");
		map.put("B", "Banana");
		map.put("C", "California");
		
		map.forEach((k, v) -> System.out.println("Key="+k+" Value="+v));
		
		//---------------
		BiConsumer<String, Integer> action = (a, b) ->
		{
			System.out.println("Key is:"+a);
			System.out.println("Value is:"+b);
		};
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Alex", 10);
		map1.put("Combodia", 20);
		map1.put("Rajesh", 30);
		
		map1.forEach(action);
		
		//------------------------
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7);
		numberList.stream()
				.filter(n -> n%2 == 0)
				.forEach(System.out::println);
		
		//---------------------------
		Map<String, Integer> map2 = new HashMap<>();
		
		map2.put("A",  1);
		map2.put("B", 3);
		map2.put("C", 10);
		
		Consumer<Map.Entry<String, Integer>> actionEntry = System.out::println;
		map2.entrySet().forEach(actionEntry);
		
		Consumer<String> actionKeySet = System.out::println;
		map2.keySet().forEach(actionKeySet);
		
		Consumer<Integer> actionValues = System.out::println;
		map2.values().forEach(actionValues);
		
		
		
		
	}

}
