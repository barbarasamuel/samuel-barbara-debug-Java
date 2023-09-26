package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {

    public void WriteSymptoms(Map<String, Integer> symptoms) throws IOException;
}
