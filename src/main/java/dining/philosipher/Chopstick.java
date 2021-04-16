package dining.philosipher;

import java.util.concurrent.Semaphore;

public class Chopstick {
    public Semaphore semaphore = new Semaphore(1, true);

    public void grab(){
        try{
            semaphore.acquire();    //Acquire semaphore if u wanna eat
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }

    public void release(){
        semaphore.release();    //Release once the eating is finished
    }
}
