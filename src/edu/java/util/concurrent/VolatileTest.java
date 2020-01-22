package edu.java.util.concurrent;

/**
 * 测试volatile的可见性
 *
 */
public class VolatileTest {
    public static void main(String[] args) {
        MyData data = new MyData();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " come in");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            data.setNum();
            System.out.println(Thread.currentThread().getName() + " set num:" + data.getNum());
        }, "ABCD").start();

        // 如果修改的值不可见，会导致死循环
        while (data.getNum() == 0) {

        }
        System.out.println(Thread.currentThread().getName() + " get num:" + data.getNum());
    }
}

class MyData {
    // 如果不加volatile，则num的修改值不可见
    private volatile int num = 0;

    public void setNum() {
        num = 60;
    }

    public int getNum() {
        return num;
    }
}