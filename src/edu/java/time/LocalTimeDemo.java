package edu.java.time;

import java.time.LocalTime;

/**
 * 只包含时间，比如：23:12:10.123
 * @author yuwen
 *
 */
public class LocalTimeDemo {
    public static void main(String[] args) {
        // getCurrentTime();
        getFutureTime();
    }

    /**
     * 获取未来时间，通过在当前时间加上3个小时，
     * 由于LocalTime不可变性，一定要接收返回值。
     */
    private static void getFutureTime() {
        LocalTime time = LocalTime.now();
        LocalTime newTime = time.plusHours(3);
        System.out.println("三个小时后的时间为:" + newTime);
    }

    /**
     * 获取当前时间
     */
    private static void getCurrentTime() {
        LocalTime time = LocalTime.now();
        System.out.println("获取当前的时间,不含有日期:" + time);
    }

}
