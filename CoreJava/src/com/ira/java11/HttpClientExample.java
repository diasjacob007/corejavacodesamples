/**
 * 
 */
package com.ira.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

/**
 * @author EVAAN
 *
 */
public class HttpClientExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "https://postman-echo.com/get?uname=Dias&password=dias123";
		// Creating the HttpRequest object
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().version(Version.HTTP_2).build();
		// Creating the HttpClient
		HttpClient client = HttpClient.newBuilder().build();
		// Sending this HttpClient request and capturing the Response
		try {
			HttpResponse<String> httpResponse = client.send(request, BodyHandlers.ofString());
			System.out.println("Response Status is: " + httpResponse.statusCode());
			System.out.println("Actual Response is: \n");
			System.out.println(httpResponse.body());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
