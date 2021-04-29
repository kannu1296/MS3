package memory.management;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class InnerClass {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<String>(){{add("a"); add("b");}};
        while (true)
            System.out.println(strings);
    }
}
