package concurrency.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 23/01/2013
 * Time: 17:02
 * To change this template use File | Settings | File Templates.
 */
public class FibonacciForkJoin extends RecursiveTask<Integer>{

    private final int position;

    public FibonacciForkJoin(int position) {
        this.position = position;
    }

    @Override
    protected Integer compute() {
        if(position <=1){
            return position;
        }

        FibonacciForkJoin previous = new FibonacciForkJoin(position -1);
        previous.fork();
        FibonacciForkJoin lastToPrevious = new FibonacciForkJoin(position -2);
        return lastToPrevious.invoke()+previous.join();
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        int position = 6;
        System.out.println("fibonacci number at position "+position+" is "+ +pool.invoke(new FibonacciForkJoin(position)));
    }
}
