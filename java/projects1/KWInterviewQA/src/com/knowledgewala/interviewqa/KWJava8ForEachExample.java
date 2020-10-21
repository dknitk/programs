package com.knowledgewala.interviewqa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class KWJava8ForEachExample {

	public static void main(String[] args) {
		newForEach();

	}

	public static void newForEach() {

		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			myList.add(i);

		Iterator<Integer> itr = myList.iterator();
		// Normal Iteration
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("Iterate through new forEach::" + t);

			}
		});

		// traversing with Consumer interface implementation
		MyConsumer myConsumer = new MyConsumer();
		myList.forEach(myConsumer);

	}
}

class MyConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("Iterate through new forEach In Class::" + t);

	}

	/*
	 * public void accept(Object t) {
	 * System.out.println("Iterate through new forEach In Class::" + t);
	 * 
	 * }
	 */

}
