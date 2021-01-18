package edu.java.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Java 8不仅分离了日期和时间，也把时区分离出来了。
 * 现在有一系列单独的类如ZoneId来处理特定时区，ZoneDateTime类来表示某时区下的时间。
 * @author yuwen
 *
 */
public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        transfromLocal2ZonedDateTime();
    }

    /**
     * 把本时区的时间转换成另一个时区的时间
     */
    public static void transfromLocal2ZonedDateTime() {
        // ZoneId能单独表示一个时区
        ZoneId america = ZoneId.of("America/New_York");
        LocalDateTime localtDateAndTime = LocalDateTime.now();
        ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localtDateAndTime, america);
        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);
    }
}
