package com.knowledgewala.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KWStreamBuilders2 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<10; i++) {
			list.add(i);
		}
		
		List<Integer> evenNumberList = list.stream()
									.filter(p -> p%2==0)
									.collect(Collectors.toList());
		
		System.out.println(evenNumberList);
		
		
	}

}
