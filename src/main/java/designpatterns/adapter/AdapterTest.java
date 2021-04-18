package designpatterns.adapter;

import designpatterns.adapter.impl.Adapter;
import designpatterns.adapter.impl.CSVFormatterImpl;
import designpatterns.adapter.impl.NewLineFormatter;

public class AdapterTest {
    public static void main(String[] args) {
        String text = "Karan.Hi.Bye";
        TextFormatter textFormatter = new NewLineFormatter();
        System.out.println(textFormatter.formatText(text));

        //Format text in CSV format
        CSVFormatter csvFormatter = new CSVFormatterImpl();
        textFormatter = new Adapter(csvFormatter);
        System.out.println(textFormatter.formatText(text));
    }
}
