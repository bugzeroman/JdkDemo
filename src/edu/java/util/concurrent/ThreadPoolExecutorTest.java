package edu.java.util.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 自定义实现线程池，一般不建议使用线程池，而需要自定义。
 *
 */
public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        testAbortPolicy();
    }

    public static void testAbortPolicy() {
        int corePoolSize = 2;
        int maximumPoolSize = 5;
        long keepAliveTime = 1;
        TimeUnit unit = TimeUnit.SECONDS;
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<Runnable>(3);
        ThreadFactory threadFactory = Executors.defaultThreadFactory();

        // 超过线程处理数量的任务会被拒绝执行
        // RejectedExecutionHandler handler = new
        // ThreadPoolExecutor.AbortPolicy();
        // 超过线程处理数量的任务会被main线程执行
        RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();
        // 超过线程处理数量的任务会丢弃等待时间最长的任务
        // RejectedExecutionHandler handler = new ThreadPoolExecutor.DiscardOldestPolicy();
        // 超过线程处理数量的任务会丢弃最新加入的任务
        // RejectedExecutionHandler handler = new ThreadPoolExecutor.DiscardPolicy();

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit,
                workQueue, threadFactory, handler);

        for (int i = 1; i <= 10; i++) {
            final int count = i;
            threadPool.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " 办理业务 " + count);
            });
        }
    }
}
