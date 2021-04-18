package designpatterns.adapter.impl;

import designpatterns.adapter.CSVFormatter;
import designpatterns.adapter.TextFormatter;

/**
 * An adapter class, provide CSV type text formatter
 */
public class Adapter implements TextFormatter {
    private CSVFormatter csvFormatter;

    public Adapter(CSVFormatter csvFormatter) {
        this.csvFormatter = csvFormatter;
    }

    @Override
    public String formatText(String text) {
        return csvFormatter.formatCSV(text);
    }
}
