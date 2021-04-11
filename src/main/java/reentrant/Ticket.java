package reentrant;

import java.util.concurrent.locks.Lock;

/**
 * Utility to represent Reentrant lock example
 */
public class Ticket implements Runnable {
    private int ticketsAvailable = 1;
    private Lock lock;
    public Ticket(Lock lock) {
        this.lock=lock;
    }

    public void run(){

        System.out.println("Waiting to book ticket for : "+
                Thread.currentThread().getName());
        try{
            lock.lock();
            if (ticketsAvailable > 0) {
                System.out.println("Booking ticket for : " +
                        Thread.currentThread().getName());

                /**
                 * Let's say system takes some time in booking ticket
                 * (here we have taken 1 second time)
                 */
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

                ticketsAvailable--;
                System.out.println("Ticket BOOKED for : " +
                        Thread.currentThread().getName());
                System.out.println("currently ticketsAvailable = " + ticketsAvailable);
            } else {
                System.out.println("Ticket NOT BOOKED for : " +
                        Thread.currentThread().getName());
            }
        }finally {
            lock.unlock();
        }
    }
}
