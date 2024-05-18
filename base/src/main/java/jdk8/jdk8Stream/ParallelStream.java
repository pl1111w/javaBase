package jdk8.jdk8Stream;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

/**
 * @title: pl1111w
 * @description: 并行流开始多线程处理问题
 * @author: Kris
 * @date 2022/3/21 17:27
 */
public class ParallelStream {

    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8).parallel().forEach(
                s -> System.out.println(Thread.currentThread().getName() + "s: " + s)
        );

        /*
         * Fork-Join 框架
         * 一个大任务 拆分小任务异步执行
         * 线程池：ForkJoinPool  extends AbstractExecutorService
         * 任务对象：ForkJoinTask
         * 执行任务的线程：ForkJoinWorkerThread extends Thread
         *
         *
         * */
        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(1, 10000);
        Long invoke = pool.invoke(task);
        System.out.println(invoke);

    }

    // RecursiveTask<V> extends ForkJoinTask<V> {
    static class SumTask extends RecursiveTask<Long> {
        long start;
        long end;

        public SumTask(long start, long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            long length = end - start;
            long sum = 0;
            if (length <= 2000) {
                for (long i = start; i < end; i++) {
                    sum = start + i;
                }
                return sum;
            } else {
                long middle = (start + end) / 2;
                SumTask leftTask = new SumTask(start, middle);
                leftTask.fork();
                SumTask rightTask = new SumTask(middle + 1, end);
                rightTask.fork();
                return leftTask.join() + rightTask.join();
            }
        }
    }
}
