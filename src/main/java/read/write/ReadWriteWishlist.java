package read.write;

import java.util.ArrayList;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteWishlist {

    public static void main(String[] args) {
         ShoppingCart shoppingCart = new ShoppingCartImpl(new ArrayList<>());
         ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        Thread threadRead1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ReentrantReadWriteLock.ReadLock rl = readWriteLock.readLock();
                try {
                    //obtain read lock, so that no write occur during reading
                    rl.lock();
                    //read from shared object
                    System.out.println(shoppingCart.getProduct());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {	}
                finally {
                    //release read lock
                    rl.unlock();
                }
            }
        });
        Thread threadRead2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ReentrantReadWriteLock.ReadLock rl = readWriteLock.readLock();
                try {
                    //obtain read lock, so that no write occur during reading
                    rl.lock();
                    //read from shared object
                    System.out.println(shoppingCart.getProduct());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {	}
                finally {
                    //release read lock
                    rl.unlock();
                }
            }
        });

        Thread threadWrite = new Thread(new Runnable() {
            @Override
            public void run() {
                //get write lock
                //lock() block current thread till it acquires write lock
                //if you don't want to block current thread, use tryLock()
                readWriteLock.writeLock().lock();
                try {
                    //if tryLock() is used, check if write lock is obtained
                    if(readWriteLock.isWriteLockedByCurrentThread()) {
                        //write to shared object
                        shoppingCart.addProduct("pixel");
                        System.out.println("thread write lock obtained");
                        Thread.sleep(1000);
                    }
                }catch (InterruptedException e) {	}
                finally {
                    if(readWriteLock.isWriteLockedByCurrentThread()) {
                        //release or unlock write lock
                        readWriteLock.writeLock().unlock();
                    }
                }
            }
        });
        threadWrite.start();
        threadRead1.start();
        threadRead2.start();

    }


}
