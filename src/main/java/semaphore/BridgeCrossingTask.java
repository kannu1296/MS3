package semaphore;

import java.util.concurrent.Semaphore;

class BridgeCrossingTask implements Runnable {
    private final Semaphore signal;

    public BridgeCrossingTask(Semaphore signal) {
        this.signal = signal;
    }

    @Override
    public void run() {
        System.out.println("Train " + Thread.currentThread().getName() + " reached at rail bridge and waiting for signal.");
        try{
            signal.acquire();
            System.out.println("Train " + Thread.currentThread().getName() + " got signal, is passing and will take 100ms");
            Thread.sleep(100);
        }catch (InterruptedException exception){
            Thread.interrupted();
        }finally {
            System.out.println("Train " + Thread.currentThread().getName() + " has passed");
            signal.release();
        }
    }
}
