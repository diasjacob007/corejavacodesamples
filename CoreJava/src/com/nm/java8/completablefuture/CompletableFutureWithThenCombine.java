/**
 * 
 */
package com.nm.java8.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author EVAAN
 *
 */
public class CompletableFutureWithThenCombine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			completableFutureThenCombine();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	private static void completableFutureThenCombine() throws InterruptedException, ExecutionException {
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
			return "Combining two CompletableFutures";
		});

		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			return "and returing the final result";
		});

		CompletableFuture<String> result = future1.thenCombine(future2, (s1, s2) -> s1 + " " + s2);
		System.out.println("Final Result is: " + result.get());
	}

}
