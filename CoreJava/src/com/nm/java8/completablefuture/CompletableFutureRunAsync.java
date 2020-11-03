/**
 * 
 */
package com.nm.java8.completablefuture;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author EVAAN
 *
 */
public class CompletableFutureRunAsync {

	/**
	 * @param args
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture.runAsync(() -> {
			// Simulate a long-running Job
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
			}
			arrayStream();
			System.out.println("I'll run in a separate thread than the main thread.");
		}).get();
	}

	private static void arrayStream() {
		// 5. Stream from Array, sort, filter and print
		String[] names = { "Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah" };
		Arrays.stream(names).forEach(System.out::println);
	}
}