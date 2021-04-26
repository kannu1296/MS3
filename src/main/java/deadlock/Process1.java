package deadlock;

public class Process1 {
    public synchronized void task1(Process2 process2){
        System.out.println("Process1 Task1");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        process2.task2();
    }

    public synchronized void task2(){
        System.out.println("Process1 Task2");
    }
}
