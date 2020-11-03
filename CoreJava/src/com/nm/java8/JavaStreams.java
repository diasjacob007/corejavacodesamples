package com.nm.java8;

import java.io.IOException;
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

public class JavaStreams {
	public static void main(String[] args) throws IOException {
//		integerStream();
//
//		intStreamWithSkip();
//
//		intStreamWithSum();
//
//		streamOfMethod();

		arrayStream();

//		arrayStreamOperation();
//
//		streamOfList();
//
//		streamFromTxtFile();
//
//		streamFromTxtFileToList();
//
//		streamRowsFromCSVAndCount();
//
//		streamRowsFromCSVAndDataParsing();
//
//		streamRowsFromCSVAndStoreInHashMap();
//
//		streamReduceMethod();
//
//		streamReduceSummaryStatistics();
	}

	/**
	 * 
	 */
	private static void streamReduceSummaryStatistics() {
		// 14. Reduction - summary statistics
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10).summaryStatistics();
		System.out.println(summary);
	}

	/**
	 * 
	 */
	private static void streamReduceMethod() {
		// 13. Reduction - sum
		double total = Stream.of(7.3, 1.5, 4.8).reduce(0.0, (Double a, Double b) -> a + b);
		System.out.println("Total = " + total);
	}

	/**
	 * @throws IOException
	 */
	private static void streamRowsFromCSVAndStoreInHashMap() throws IOException {
		// 12. Stream rows from CSV file, store fields in HashMap
		Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
		Map<String, Integer> map = new HashMap<>();
		map = rows3.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> Integer.parseInt(x[1]) > 15)
				.collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[1])));
		rows3.close();
		for (String key : map.keySet()) {
			System.out.println(key + "  " + map.get(key));
		}
	}

	/**
	 * @throws IOException
	 */
	private static void streamRowsFromCSVAndDataParsing() throws IOException {
		// 11. Stream rows from CSV file, parse data from rows
		Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
		rows2.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> Integer.parseInt(x[1]) > 15)
				.forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
		rows2.close();
	}

	/**
	 * @throws IOException
	 */
	private static void streamRowsFromCSVAndCount() throws IOException {
		// 10. Stream rows from CSV file and count
		Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
		int rowCount = (int) rows1.map(x -> x.split(",")).filter(x -> x.length == 3).count();
		System.out.println(rowCount + " rows.");
		rows1.close();
	}

	/**
	 * @throws IOException
	 */
	private static void streamFromTxtFileToList() throws IOException {
		// 9. Stream rows from text file and save to List
		List<String> bands2 = Files.lines(Paths.get("bands.txt")).filter(x -> x.contains("jit"))
				.collect(Collectors.toList());
		bands2.forEach(x -> System.out.println(x));
	}

	/**
	 * @throws IOException
	 */
	private static void streamFromTxtFile() throws IOException {
		// 8. Stream rows from text file, sort, filter, and print
		Stream<String> bands = Files.lines(Paths.get("bands.txt"));
		bands.sorted().filter(x -> x.length() > 13).forEach(System.out::println);
		bands.close();
	}

	/**
	 * 
	 */
	private static void streamOfList() {
		// 7. Stream from List, filter and print
		List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
		people.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);
	}

	/**
	 * 
	 */
	private static void arrayStreamOperation() {
		// 6. average of squares of an int array
		Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x * x).average().ifPresent(System.out::println);
	}

	/**
	 * 
	 */
	private static void streamOfMethod() {
		// 4. Stream.of, sorted and findFirst
		Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out::println);
	}

	/**
	 * 
	 */
	private static void intStreamWithSum() {
		// 3. Integer Stream with sum
		System.out.println(IntStream.range(1, 5).sum());
		System.out.println();
	}

	/**
	 * 
	 */
	private static void intStreamWithSkip() {
		// 2. Integer Stream with skip
		IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));
		System.out.println();
	}

	/**
	 * 
	 */
	private static void integerStream() {
		// 1. Integer Stream
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
	}

	/**
	 * 
	 */
	private static void arrayStream() {
		// 5. Stream from Array, sort, filter and print
		String[] names = { "Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah" };
//		Arrays.stream(names) // same as Stream.of(names)
//				.filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);
		Arrays.stream(names).forEach(System.out::println);
	}
}
