package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class AnalyticsCounter {
	private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;
	
	public static void main(String args[]) throws Exception {

		// first get input
		//BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));

		File myFile = new File(".\\samuel-barbara-debug-Java\\Project02Eclipse\\symptoms.txt");
		FileReader SymptomsFile = new FileReader(myFile);//(".\\..\\symptoms.txt");

		BufferedReader reader = new BufferedReader (SymptomsFile);
		//Map<String, Integer> SymptomsMap = new HashMap<>();

		String line = reader.readLine();
		while (line != null) {

			System.out.println("symptom from file: " + line);

			if (line.equals("headache")) {
				headacheCount++;
				System.out.println("number of headaches: " + headacheCount);
			}
			else if (line.equals("rash")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.readLine();	// get another symptom
		}
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}
