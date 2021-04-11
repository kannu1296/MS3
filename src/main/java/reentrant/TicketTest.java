package reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketTest {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();    //Example of reentrant lock
        Ticket ticket = new Ticket(lock);
        new Thread(ticket,"Passenger1 Thread").start();
        new Thread(ticket,"Passenger2 Thread").start();

    }
}
