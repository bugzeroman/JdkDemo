package edu.java.util.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 测试线程池工具类
 */
public class ExecutorsTest {
    public static void main(String[] args) {
        int nThreads = 10;
        ExecutorService threadPool = Executors.newFixedThreadPool(nThreads);
    }

}
