package concurrency.callable.future.future;

import concurrency.callable.future.callable.Factorial;
import concurrency.callable.future.callable.Sum;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Sum sum = new Sum(10);
        Factorial fact = new Factorial(5);
        Future<Integer> sumResult = executorService.submit(sum);
        Future<Integer> factResult = executorService.submit(fact);
        try {
            System.out.println(sumResult.get());
            System.out.println(factResult.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
