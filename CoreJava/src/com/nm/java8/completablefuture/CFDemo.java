package com.nm.java8.completablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class CFDemo {
	public static void main(String[] args) {
		CFDemo cfDemo = new CFDemo();
		try {
			// blocking call
			cfDemo.getUsers();
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void getUsers() throws ExecutionException, InterruptedException {
		CompletableFuture<List<User>> userList = CompletableFuture.supplyAsync(() -> {
			return getListOfUsers();
		}).thenCompose(users -> {
			List<User> upperCaseList = null;
			try {
				upperCaseList = users.get().stream().map(user -> {
					user.setFirstName(user.getFirstName().toUpperCase());
					user.setLastName(user.getLastName().toUpperCase());
					return user;
				}).collect(Collectors.toList());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			return CompletableFuture.completedFuture(upperCaseList);
		});

		userList.get().forEach(
				user -> System.out.println(user.getFirstName() + ":" + user.getLastName() + ":" + user.getEmailAddr()));
	}

	// Dummy method for adding List of Users
	private CompletableFuture<List<User>> getListOfUsers() {
		List<User> users = new ArrayList<User>();
		users.add(new User("Jack", "Reacher", "abc@xyz.com"));
		users.add(new User("Remington", "Steele", "rs@cbd.com"));
		users.add(new User("Laura", "Holt", "lh@cbd.com"));
		users.add(new User("Jonathan", "Raven", "jr@sn.com"));
		users.add(new User("Tom", "Hanson", "th@jd.com"));
		users.add(new User("Alexander", "Scott", "as@is.com"));
		users.add(new User("Jim", "Phelps", "jp@mi.com"));
		return CompletableFuture.completedFuture(users);
	}

	class User {
		private String FirstName;
		private String LastName;
		private String emailAddr;

		public User(String firstName, String lastName, String emailAddr) {
			super();
			FirstName = firstName;
			LastName = lastName;
			this.emailAddr = emailAddr;
		}

		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			FirstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public String getEmailAddr() {
			return emailAddr;
		}

		public void setEmailAddr(String emailAddr) {
			this.emailAddr = emailAddr;
		}

		@Override
		public String toString() {
			return "User [FirstName=" + FirstName + ", LastName=" + LastName + ", emailAddr=" + emailAddr + "]";
		}
	}
}