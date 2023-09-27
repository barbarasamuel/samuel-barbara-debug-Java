package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String args[]) throws Exception{
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
