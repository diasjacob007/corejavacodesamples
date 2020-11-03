/**
 * 
 */
package com.ira.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * @author EVAAN
 *
 */
public class FilesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var uri = "./cricketers.txt";
		try {
			// Method to write some data into the existing file
			Files.writeString(Path.of(uri), "Wasim Akram \n", StandardOpenOption.TRUNCATE_EXISTING);
			String data = Files.readString(Path.of(uri));
			System.out.println("Data inside the file is: \n" + data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
