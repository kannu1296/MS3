package memory.management.staticvariable;

import javax.servlet.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

public class StaticTest {
    public static List<Double> list = new ArrayList<>();

    public void populateList() {
        for (int i = 0; i < 100000000; i++) {
            list.add(Math.random());
        }
        System.out.println("Debug Point 2");
    }

    public static void main(String[] args) {
        System.out.println("Debug Point 1");
        new StaticTest().populateList();
        System.out.println("Debug Point 3");
    }
}
