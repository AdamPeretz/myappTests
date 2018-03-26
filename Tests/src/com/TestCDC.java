package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TestCDC {

	public static void main(String[] args) throws IOException {

		File folder = new File("C:\\Users\\Adam Peretz\\Desktop\\lesson");
		File[] listOfFiles = folder.listFiles();
		int countDirectory = 0;
		// Count folder
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				// System.out.println("File " + listOfFiles[i].getName());
			} else if (listOfFiles[i].isDirectory()) {
				// System.out.println("Directory " + listOfFiles[i].getName());
				countDirectory++;
			}
		}

		// found all folder
		int j = 0;
		String[] arrayDirectory = new String[countDirectory];
		String[] shourtDirectory = new String[countDirectory];

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isDirectory()) {
				arrayDirectory[i] = listOfFiles[j].getName();
				shourtDirectory[i] = listOfFiles[j].getName().substring(7, 9).trim();
				j++;
			}
		}

		System.out.println(Arrays.toString(arrayDirectory));
		System.out.println(Arrays.toString(shourtDirectory));
		System.out.println("");

		for (int k = 0; k < arrayDirectory.length; k++) {

			boolean therAreChange = false;
			FileReader file = new FileReader("C:\\Users\\Adam Peretz\\Desktop\\lesson\\" + arrayDirectory[k]
					+ "\\lesson" + shourtDirectory[k] + ".json");
			BufferedReader reader = new BufferedReader(file);
			String text = "";
			String line = reader.readLine();

			File newFile = new File("C:\\Users\\Adam Peretz\\Desktop\\lesson\\" + arrayDirectory[k] + "\\lesson"
					+ shourtDirectory[k] + ".json");
			// if (newFile.exists()) {
			// System.out.println("The file is alredy exists");
			// } else {
			try {
				newFile.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				FileWriter fileW = new FileWriter(newFile, false);
				BufferedWriter buffW = new BufferedWriter(fileW);

				while (line != null) {

					if (line == null) {
						break;
					} else if (line.contains("*B ") && line.contains(" *B")) {
						int BIsHere = line.indexOf("*B ");

						StringBuilder sb = new StringBuilder(line);
						sb.replace(BIsHere, BIsHere + 3, "<b>");
						int secondBIsHere = line.indexOf(" *B");

						sb.replace(secondBIsHere, secondBIsHere + 3, "</b>");
						line = sb.toString();
						// System.out.println(line);
						buffW.write(line + '\n');
						therAreChange = true;

					} else if (line != null) {
						// System.out.println(line);
						buffW.write(line + '\n');
					}
					line = reader.readLine();

				}

				buffW.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			// }

			reader.close();
			if (therAreChange) {
				System.out.println("Changes are done for folder: " + arrayDirectory[k]);
			} else {
				System.out.println("There aren't change for folder: " + arrayDirectory[k]);
			}
		}

	}
}
