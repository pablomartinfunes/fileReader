package com.pmf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		File file = new File("nombres.txt");
		BufferedReader buffer;
		String line;

		try {
			buffer = new BufferedReader(new FileReader(file));

			while ((line = buffer.readLine()) != null)
				System.out.println("Linea leida: " + line);

			buffer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Fin");
	}
}
