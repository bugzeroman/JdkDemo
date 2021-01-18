package edu.java.time;

import java.time.Clock;

/**
 * Clock时钟类用于获取当时的时间戳，或当前时区下的日期时间信息。
 * 以前用到System.currentTimeInMillis()和TimeZone.getDefault()的地方都可用Clock替换。
 * @author yuwen
 *
 */
public class ClockDemo {
    public static void main(String[] args) {
        getClockTime();
    }

    /**
     * 获取当前系统时钟的UTC时间，获取当前系统时钟的对应时区时间
     */
    private static void getClockTime() {
        // Returns the current time based on your system clock and set to UTC.
        Clock clock = Clock.systemUTC();
        System.out.println("Clock : " + clock.millis());

        // Returns time based on system clock zone
        Clock defaultClock = Clock.systemDefaultZone();
        System.out.println("Clock : " + defaultClock.millis());
    }
}
