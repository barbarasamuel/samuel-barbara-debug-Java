package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
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
    public void WriteSymptoms(Map<String, Integer>symptomsMap) throws IOException{


        FileWriter writer = new FileWriter("result.out");

        writer.write("headache: " + this.counter + "\n"); //headacheCount + "\n");
        writer.write("rash: " + this.counter + "\n"); //rashCount + "\n");
        writer.write("dialated pupils: " + this.counter + "\n"); //pupilCount + "\n");
        //writer.write(this.subject + " " + this.counter + "\n");
        writer.close();

    }
}
