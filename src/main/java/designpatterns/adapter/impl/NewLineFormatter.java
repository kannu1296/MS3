package designpatterns.adapter.impl;

import designpatterns.adapter.TextFormatter;

public class NewLineFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        String newString = text.replace('.', '\n');
        return newString;
    }
}
