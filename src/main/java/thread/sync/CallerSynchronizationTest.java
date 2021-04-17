package thread.sync;

/**
 * Program to show how synchronization Solved the problem
 */
public class CallerSynchronizationTest {
    public static void main(String[] args) {
        CallMeWithSynchronization callMeWithSynchronization = new CallMeWithSynchronization();
        CallerSynchronization callerSynchronization1 = new CallerSynchronization(callMeWithSynchronization, "Hi");
        CallerSynchronization callerSynchronization2 = new CallerSynchronization(callMeWithSynchronization, "Hello");
        CallerSynchronization callerSynchronization3 = new CallerSynchronization(callMeWithSynchronization, "Bye");

        Thread thread1 = new Thread(callerSynchronization1);
        Thread thread2 = new Thread(callerSynchronization2);
        Thread thread3 = new Thread(callerSynchronization3);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
