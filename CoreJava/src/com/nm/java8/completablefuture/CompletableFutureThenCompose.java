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
public class CompletableFutureThenCompose {

	/**
	 * @param args
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
			return "Hello";
		}).thenCompose(value -> {
			String str = value.toUpperCase();
			return CompletableFuture.completedFuture(str);
		});
		System.out.println("Data is: " + cf.get());
	}

}
