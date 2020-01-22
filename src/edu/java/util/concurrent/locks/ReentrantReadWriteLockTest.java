/**
 * 
 */
package edu.java.util.concurrent.locks;

import java.util.HashMap;
import java.util.Map;

/**
 * 可重入读写锁
 *
 */
public class ReentrantReadWriteLockTest {
    public static void main(String[] args) {
        Mycache cache = new Mycache();

        for (int i = 1; i <= 5; i++) {
            String index = String.valueOf(i);
            new Thread(() -> {
                cache.put(index, index);
            }, index).start();
        }

        for (int i = 1; i <= 5; i++) {
            String index = String.valueOf(i);
            new Thread(() -> {
                cache.get(index);
            }, index).start();
        }
    }

}

class Mycache {
    private volatile Map<String, String> map = new HashMap<>();

    public void put(String key, String value) {
        System.out.println(Thread.currentThread().getName() + "正在写入:" + key);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        map.put(key, value);
        System.out.println(Thread.currentThread().getName() + "完成写入:" + key);
    }

    public void get(String key) {
        System.out.println(Thread.currentThread().getName() + "正在读取:" + key);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String value = map.get(key);
        System.out.println(Thread.currentThread().getName() + "完成读取:" + value);
    }
}
