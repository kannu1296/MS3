package concurrency.forkjoin;

import java.util.concurrent.RecursiveTask;

public class Sum extends RecursiveTask<Integer> {
    private final int threshold = 1000;
    private int data[];
    private int start, end;

    public Sum(int[] data , int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if((end - start) <= threshold){
            for(int i=start; i<end; i++)
                sum += data[i];
        }else{
            int mid = (start + end)/2;
            Sum subtask1 = new Sum(data, start, mid);
            Sum subtask2 = new Sum(data, mid+1, end);
            subtask1.fork();
            subtask2.fork();
            sum = subtask1.join() + subtask2.join();
        }
        return sum;
    }
}
