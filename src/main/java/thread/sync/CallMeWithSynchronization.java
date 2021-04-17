package thread.sync;

/**
 * program to demonstarte the use of synchronization
 */
public class CallMeWithSynchronization {

    public synchronized void call(String msg){
        System.out.print("[" +" "+msg);
        try{
            Thread.sleep(100);
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
        System.out.print(" "+"]");
    }
}
