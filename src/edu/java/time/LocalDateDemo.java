package edu.java.time;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;

/**
 * Java8提供的新时间类，只包含日期，比如：2018-02-05，不包含时间
 * @author yuwen
 *
 */
public class LocalDateDemo {
    public static void main(String[] args) {
        // getTodayDate();
        // getYearMonthDay();
        // getSpecifyDate();
        // judgeDateEqual();
        // checkBirthday();
        // getFutureDate();
        // getPastDate();
        // compareDate();
        // checkLeapYear();
    }

    /**
     * 检查闰年
     */
    private static void checkLeapYear() {
        LocalDate today = LocalDate.now();
        // today = LocalDate.of(2020, 1, 1);
        if (today.isLeapYear()) {
            System.out.println("This year is leap year");
        } else {
            System.out.println("This year is not leap year");
        }
    }

    /**
     * 判断日期是早于还是晚于另一个日期
     */
    private static void compareDate() {
        LocalDate today = LocalDate.now();

        LocalDate tomorrow = LocalDate.of(2028, 2, 28);
        if (tomorrow.isAfter(today)) {
            System.out.println("之后的日期:" + tomorrow);
        }

        LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);
        if (yesterday.isBefore(today)) {
            System.out.println("之前的日期:" + yesterday);
        }
    }

    /**
     * 获取未来的日期，通过在当前日期减去一年，同样也可加上一年
     */
    private static void getPastDate() {
        LocalDate today = LocalDate.now();

        LocalDate previousYear = today.minus(1, ChronoUnit.YEARS);
        System.out.println("一年前的日期 : " + previousYear);

        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("一年后的日期:" + nextYear);
    }

    /**
     * 获取未来的日期，通过在当前日期加上一周
     */
    private static void getFutureDate() {
        LocalDate today = LocalDate.now();
        System.out.println("今天的日期为:" + today);
        LocalDate afterWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("一周后的日期为:" + afterWeek);
    }

    /**
     * 检查像生日这种周期性事件
     */
    private static void checkBirthday() {
        // 获取生日所在的月份和天数
        LocalDate birthday = LocalDate.of(1989, 6, 30);
        MonthDay birthdayMD = MonthDay.of(birthday.getMonth(), birthday.getDayOfMonth());

        // 获取当天所在的月份和天数
        LocalDate date1 = LocalDate.now();
        MonthDay currentMD = MonthDay.from(date1);

        if (currentMD.equals(birthdayMD)) {
            System.out.println("生日到了，恭喜！");
        } else {
            System.out.println("生日还没有到~");
        }
    }

    /**
     * 判断两个日期是否相等
     */
    private static void judgeDateEqual() {
        LocalDate date1 = LocalDate.now();

        LocalDate date2 = LocalDate.of(2021, 1, 18);

        if (date1.equals(date2)) {
            System.out.println("时间相等");
        } else {
            System.out.println("时间不等");
        }
    }

    /**
     * 获取指定的日期
     */
    private static void getSpecifyDate() {
        LocalDate date = LocalDate.of(1989, 6, 30);
        System.out.println("自定义指定日期:" + date);
    }

    /**
     * 获取年、月、日信息
     */
    private static void getYearMonthDay() {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();

        System.out.println("year:" + year);
        System.out.println("month:" + month);
        System.out.println("day:" + day);

    }

    /**
     * 获取今天的日期
     */
    private static void getTodayDate() {
        LocalDate today = LocalDate.now();
        System.out.println("今天的日期:" + today);
    }
}
