package concurrency.callable.future.callable;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {
    private int num;

    public Factorial(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        while(num != 0){
            fact *= num;
            num--;
        }
        return fact;
    }
}
