package read.write;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Utility to test ReadWrite lock
 */
public class ReadWriteWishlist {

    public static void main(String[] args) {
         ShoppingCart shoppingCart = new ShoppingCartImpl(new ArrayList<>());
         ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        Thread threadRead1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ReentrantReadWriteLock.ReadLock rl = readWriteLock.readLock();
                try {
                    rl.lock();  //obtain read lock, so that no write occur during reading
                    System.out.println(shoppingCart.getProduct());  //read from shared object
                    Thread.sleep(1000);
                } catch (InterruptedException e) {	}
                finally {
                    rl.unlock();    //release read lock
                }
            }
        });
        Thread threadRead2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ReentrantReadWriteLock.ReadLock rl = readWriteLock.readLock();
                try {
                    rl.lock();  //obtain read lock, so that no write occur during reading
                    System.out.println(shoppingCart.getProduct());  //read from shared object
                    Thread.sleep(1000);
                } catch (InterruptedException e) {	}
                finally {
                    rl.unlock();    //release read lock
                }
            }
        });

        Thread threadWrite1 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean trylock = readWriteLock.writeLock().tryLock();  //get write lock
                if(trylock){
                    try {
                        if(readWriteLock.isWriteLockedByCurrentThread()) {
                            shoppingCart.addProduct("pixel");   //write to shared object
                            System.out.println("thread write lock obtained");
                            Thread.sleep(1000);
                        }
                    }catch (InterruptedException e) {	}
                    finally {
                        if(readWriteLock.isWriteLockedByCurrentThread()) {
                            readWriteLock.writeLock().unlock(); //release or unlock write lock
                        }
                    }
                }

            }
        });

        Thread threadWrite2 = new Thread(new Runnable() {
            @Override
            public void run() {
                /**
                 * get write lock
                 *lock() block current thread till it acquires write lock
                 *if you don't want to block current thread, use tryLock()
                 */
                readWriteLock.writeLock().lock();
                try {
                    //if tryLock() is used, check if write lock is obtained
                    if(readWriteLock.isWriteLockedByCurrentThread()) {
                        shoppingCart.addProduct("iphone");  //write to shared object
                        System.out.println("thread write lock obtained");
                        Thread.sleep(1000);
                    }
                }catch (InterruptedException e) {	}
                finally {
                    if(readWriteLock.isWriteLockedByCurrentThread()) {
                        readWriteLock.writeLock().unlock();     //release or unlock write lock
                    }
                }
            }
        });
        threadWrite1.start();
        threadRead1.start();
        threadWrite2.start();
        threadRead2.start();
    }
}
