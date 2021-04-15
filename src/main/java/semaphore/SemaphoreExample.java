package semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore signal = new Semaphore(1);
        BridgeCrossingTask bridgeCrossingTask = new BridgeCrossingTask(signal);
        Thread thread1 = new Thread(bridgeCrossingTask, "Rajdhani");
        Thread thread2 = new Thread(bridgeCrossingTask, "Satabdhi");
        thread1.start();
        thread2.start();
    }
}
