package edu.java.time;

import java.time.Instant;
import java.util.Date;

/**
 * 时间戳信息里同时包含了日期和时间，
 * 这和java.util.Date很像。
 * 实际上Instant类确实等同于 Java 8之前的Date类
 * 可以使用Date类和Instant类各自的转换方法互相转换
 * @author yuwen
 *
 */
public class InstantDemo {
    public static void main(String[] args) {
        // getCurrentTimestamp();
        // transformInstant2Date();
        transformDate2Instant();
    }

    /**
     * 把Date转换为Instant类型
     */
    private static void transformDate2Instant() {
        Date date = new Date();
        Instant instant = date.toInstant();
        System.out.println("Date=" + date);
        System.out.println("Instant=" + instant);
    }

    /**
     * 把Instant转换为Date类型
     */
    private static void transformInstant2Date() {
        Instant instant = Instant.now();
        Date date = Date.from(instant);
        System.out.println("Instant=" + instant);
        System.out.println("Date=" + date);
    }

    /**
     * 获取当前时间戳
     */
    private static void getCurrentTimestamp() {
        Instant timestamp = Instant.now();
        System.out.println("What is value of this instant " + timestamp.toEpochMilli());
        System.out.println("The Date and Time of this instant " + timestamp);
    }

}
