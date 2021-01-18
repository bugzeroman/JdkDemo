package edu.java.time.format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 使用预定义的格式化工具去解析或格式化日期
 * @author yuwen
 *
 */
public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        // transformString2Date();
        transformDate2String();
    }

    /**
     * LocalDateTime类型转换为字符串，然后再解析为LocalDate
     */
    private static void transformDate2String() {
        LocalDateTime date = LocalDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        // 日期转字符串
        String str = date.format(format);
        System.out.println("日期转换为字符串:" + str);

        // 字符串转日期
        LocalDate date2 = LocalDate.parse(str, format);
        System.out.println("日期类型:" + date2);
    }

    /**
     * 把字符串表示的时间解析为LocalDate类型
     */
    public static void transformString2Date() {
        String dateStr = "20180205";
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(dateStr + " 格式化后的日期为:  " + date);
    }
}
