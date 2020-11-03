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
public class CompletableFutureExceptionally {

	/**
	 * @param args
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		String str = "Hello";
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
			return str;
		}).exceptionally(exp -> {
			System.out.println("Exception thrown with message - " + exp.getMessage());
			return "";
		});

		String val = completableFuture.get();
		System.out.println(val);
	}

}
