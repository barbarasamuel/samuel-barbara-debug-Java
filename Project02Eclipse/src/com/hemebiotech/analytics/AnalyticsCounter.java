package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class AnalyticsCounter {

	ISymptomReader reader;
	ISymptomWriter writer;

	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {

		this.reader = reader;
		this.writer = writer;
	}

	public Map<String,Integer> countSymptoms(List<String> symptoms){
		//to get and to count each symptom
		int i = 0;
		Map<String, Integer> symptomsMap = new HashMap<>();
		while (i < symptoms.size()){
			symptomsMap.putIfAbsent(symptoms.get(i),0);
			symptomsMap.put(symptoms.get(i),symptomsMap.get(symptoms.get(i))+1);
			i++;
		}
		return symptomsMap;
	}

	public Map<String,Integer> sortSymptoms(Map<String,Integer> symptoms){
		//to sort the symptoms map
		TreeMap<String, Integer> orderedMap = new TreeMap<>(symptoms);

		return orderedMap;
	}
	public static void main(String args[]) throws Exception {

		// steps set
		ISymptomReader symptomsList = new ReadSymptomDataFromFile(".\\samuel-barbara-debug-Java\\Project02Eclipse\\symptoms.txt");
		ISymptomWriter writerBase = new WriteSymptomDataToFile("",0);
		AnalyticsCounter analyticsCounterResult = new AnalyticsCounter(symptomsList,writerBase);

		List<String> listResult = symptomsList.GetSymptoms();
		Map<String,Integer> countSymptomsResult = analyticsCounterResult.countSymptoms(listResult);
		countSymptomsResult = analyticsCounterResult.sortSymptoms(countSymptomsResult);
		writerBase.WriteSymptoms(countSymptomsResult);

	}
}
