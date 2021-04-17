package deadlock;

public class Process2 {
    public synchronized void task1(Process1 process1){
        System.out.println("Process2 Task1");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        process1.task2();
    }
    public synchronized void task2(){
        System.out.println("Process2 Task2");
    }
}
