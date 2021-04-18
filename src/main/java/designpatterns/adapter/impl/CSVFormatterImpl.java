package designpatterns.adapter.impl;

import designpatterns.adapter.CSVFormatter;

public class CSVFormatterImpl implements CSVFormatter {
    @Override
    public String formatCSV(String csv) {
        String csvString = csv.replace('.', ',');
        return csvString;
    }
}
