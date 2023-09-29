package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Implementation to the ISymptomWriter interface
 *
 */

public class WriteSymptomDataToFile implements ISymptomWriter {
    private String subject;
    private Integer counter;


    public WriteSymptomDataToFile (String subject, Integer counter) {
        this.subject = subject;
        this.counter = counter;
    }

    /**
     *
     * Implement the ISymptomWriter interface to write the symptoms and their number in the result.out file
     */

    @Override
    public void writeSymptoms(Map<String, Integer>symptomsMap) throws IOException{

        //to write the symptomsMap map in the result.out file
        FileWriter writer = new FileWriter("result.out");

        for (String orderedList : symptomsMap.keySet()) {
            writer.write(orderedList + ": " + symptomsMap.get(orderedList) + "\n");
        }

        writer.close();

    }
}
