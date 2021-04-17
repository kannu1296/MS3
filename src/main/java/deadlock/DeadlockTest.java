package deadlock;

public class DeadlockTest extends Thread {
    private Process1 process1 = new Process1();
    private Process2 process2 = new Process2();

    @Override
    public void run() {
        process2.task1(process1);
    }

    public void deadlockStar(Thread thread){
        thread.start();
        process1.task1(process2);
    }
    public static void main(String[] args) {
        DeadlockTest deadlockTest = new DeadlockTest();
        deadlockTest.start();
        Thread thread = new Thread(deadlockTest);
        deadlockTest.deadlockStar(thread);
    }
}
