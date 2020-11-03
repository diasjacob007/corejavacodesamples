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
public class CompletableFutureThenApply {

	/**
	 * @param args
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		completableFutureThenApply();
	}

	/**
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	private static void completableFutureThenApply() throws InterruptedException, ExecutionException {
		String combinedResult = CompletableFuture.supplyAsync(() -> {
			return "Rajeev";
		}).thenApply(name -> {
			return "Hello " + name;
		}).thenApply(greeting -> {
			return greeting + " Welcome to the concepts of CompletableFuture ";
		}).get();

		System.out.println("Combined result of two CompletableFuture : " + combinedResult);
	}
}
