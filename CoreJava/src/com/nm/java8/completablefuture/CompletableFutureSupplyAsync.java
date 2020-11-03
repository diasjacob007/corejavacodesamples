/**
 * 
 */
package com.nm.java8.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * @author EVAAN
 *
 */
public class CompletableFutureSupplyAsync {

	/**
	 * @param args
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		supplyAsyncUsingOverride();
		supplyAsyncUsingLambda();
	}

	/**
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	private static void supplyAsyncUsingOverride() throws InterruptedException, ExecutionException {
		// Run a task specified by a Supplier object asynchronously
		CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
			@Override
			public String get() {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					throw new IllegalStateException(e);
				}
				return "Result of the asynchronous computation";
			}
		});

		// Block and get the result of the Future
		String result = future.get();
		System.out.println(result);
	}

	private static void supplyAsyncUsingLambda() throws InterruptedException, ExecutionException {
		// Using Lambda Expression
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			return "Result of the asynchronous computation";
		});
	}

}
