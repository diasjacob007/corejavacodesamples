/**
 * 
 */
package com.nm.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author EVAAN
 *
 */
public class StreamConcepts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		streamOfMethod();
//		streamOfIntegerArray();
//		listprocessingStream();
//		streamOfRandomNumbers();
//		streamOfCharacters();
	}

	/**
	 * 
	 */
	private static void streamOfCharacters() {
		IntStream intStream = "1365_abcd".chars();
		intStream.forEach(System.out::println);
	}

	/**
	 * 
	 */
	private static void streamOfRandomNumbers() {
		Stream<Integer> intStream = Stream.generate(new Supplier<Integer>() {
			@Override
			public Integer get() {
				return new Random().nextInt(100);
			}
		});
		intStream.limit(30).forEach(System.out::println);
	}

	/**
	 * 
	 */
	private static void listprocessingStream() {
		List<Integer> intLst = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			intLst.add(i);
		}
		Stream<Integer> stream = intLst.stream();
		stream.forEach(System.out::println);
	}

	/**
	 * 
	 */
	private static void streamOfIntegerArray() {
		Stream<Integer> stream = Stream.of(new Integer[] { 4, 7, 1, 2, 9, 10 });
		stream.forEach(i -> System.out.println(i));
	}

	/**
	 * 
	 */
	private static void streamOfMethod() {
		Stream<Integer> stream = Stream.of(1, 5, 7, 2, 3, 4, 9, 10);
		stream.forEach(System.out::println);
	}

}
