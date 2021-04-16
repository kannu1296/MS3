package concurrency.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerTest {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        CreateBuffer createBuffer = new CreateBuffer(exchanger);
        UseBuffer useBuffer = new UseBuffer(exchanger);
        Thread thread1 = new Thread(createBuffer);
        Thread thread2 = new Thread(useBuffer);
        thread1.start();
        thread2.start();
    }
}
