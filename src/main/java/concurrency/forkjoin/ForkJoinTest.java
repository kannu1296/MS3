package concurrency.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinTest {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int data[] = new int[100000];

        for(int i=0; i<100000; i++)
            data[i] = i;

        Sum sum = new Sum(data, 0, 100000);
        int result = forkJoinPool.invoke(sum);
        System.out.println(result);
        forkJoinPool.shutdown();
    }
}
