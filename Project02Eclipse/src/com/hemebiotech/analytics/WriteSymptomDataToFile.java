package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;


public class WriteSymptomDataToFile implements ISymptomWriter {
    private String subject;
    private Integer counter;

    /**
     *
     * @param subject, counter to know the symptom and its counter
     */
    public WriteSymptomDataToFile (String subject, Integer counter) {
        this.subject = subject;
        this.counter = counter;
    }



    @Override
    public void WriteSymptoms(Map<String, Integer>symptomsMap){


        FileWriter writer = new FileWriter("result.out");
        try {
            //writer.write("headache: " + counter + "\n");
            //writer.write("rash: " + counter + "\n");
            writer.write(this.subject + " " + this.counter + "\n");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();

        }
    }
}
