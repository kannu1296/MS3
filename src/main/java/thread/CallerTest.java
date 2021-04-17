package thread;

/**
 * A program to demonstrate the need of synchronization
 */
public class CallerTest {
    public static void main(String[] args) {
        CallMe callMe = new CallMe();
        Caller caller1 = new Caller(callMe, "Hi");
        Caller caller2 = new Caller(callMe, "Hello");
        Caller caller3 = new Caller(callMe, "Bye");

        caller1.start();
        caller2.start();
        caller3.start();

        /**
         * Main thread should wait till the other thread completes execution
         */
        try{
            caller1.join();
            caller2.join();
            caller3.join();
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
}
