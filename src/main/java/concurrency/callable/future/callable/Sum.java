package concurrency.callable.future.callable;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
    private int sum;

    public Sum(int sum) {
        this.sum = sum;
    }

    @Override
    public Integer call() throws Exception {
        int add = 0;
        for(int i=1; i<=sum; i++)
            add += i;
        return add;
    }
}
