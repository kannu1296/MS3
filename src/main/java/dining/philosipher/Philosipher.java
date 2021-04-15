package dining.philosipher;
import java.util.concurrent.ThreadLocalRandom;

public class Philosipher extends Thread {
    private int num;
    private Chopstick leftChopstick;
    private Chopstick rightChopstick;

    public Philosipher(int num, Chopstick leftChopstick, Chopstick rightChopstick) {
        this.num = num;
        this.leftChopstick = leftChopstick;
        this.rightChopstick = rightChopstick;
    }

    public void run(){
        while(true){
            leftChopstick.grab();
            System.out.println("philosopher " + (num+1) + " grabs left chopstick.");
            rightChopstick.grab();
            System.out.println("philosopher " + (num+1) + " grabs right chopstick.");
            eat();
            rightChopstick.release();
            System.out.println("philosopher " + (num+1) + " release right chopstick.");
            leftChopstick.release();
            System.out.println("philosopher " + (num+1) + " release left chopstick.");
        }
    }
    public void eat(){
        try {
            int sleepTime = ThreadLocalRandom.current().nextInt(0, 1000);
            System.out.println("philosopher " + (num+1) + " eats for " + sleepTime);
            Thread.sleep(sleepTime);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
