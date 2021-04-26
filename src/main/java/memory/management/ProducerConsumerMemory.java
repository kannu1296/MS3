package memory.management;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerMemory {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);  //Thread pool of fixed size: 2 threads
        BufferMemory buffer = new BufferMemory();
        Runnable producerTask = () -> {
            try{
                while(true){
                    buffer.add();   //Add items in the list
                    Thread.sleep(100);  //Sleep, so consumer can consume
                }

            }catch (InterruptedException exception){
                exception.printStackTrace();
            }
        };
        Runnable consumerTask = () -> {
            try{
                while (true){
                    int poll = buffer.poll();   //poll items from the list
                    System.out.println(poll);
                    Thread.sleep(100);  //Sleep, so producer can produce
                }
            }catch (InterruptedException exception){
                exception.printStackTrace();
            }
        };
        executorService.execute(producerTask);
        executorService.execute(consumerTask);
        executorService.shutdown();
    }
}
