package memory.management.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EqualAndHashcodeNotOverriden {
    public void memoryLeak(){
        Map<Person, Integer> map = new HashMap<>();
        for(int i=0; i<10000; i++) {
            map.put(new Person("jon"), 1);
            System.out.println(map.size());
        }
    }

    public static void main(String[] args) {
        EqualAndHashcodeNotOverriden notOverriden = new EqualAndHashcodeNotOverriden();
        notOverriden.memoryLeak();
    }
}
