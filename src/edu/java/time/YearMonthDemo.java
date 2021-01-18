package edu.java.time;

import java.time.Month;
import java.time.YearMonth;

/**
 * 表示信用卡到期这类固定日期,与 MonthDay检查重复事件的例子相似
 * @author yuwen
 *
 */
public class YearMonthDemo {
    public static void main(String[] args) {
        // getLengthOfMonth();
        getCreditCardExpiry();

    }

    /**
     * 获取信用卡过期日志
     */
    public static void getCreditCardExpiry() {
        YearMonth creditCardExpiry = YearMonth.of(2019, Month.FEBRUARY);
        System.out.printf("Your credit card expires on %s %n", creditCardExpiry);
    }

    /**
     * 获取指定月份的天数，在判断2月有28天还是29天时非常有用。
     */
    public static void getLengthOfMonth() {
        YearMonth currentYM = YearMonth.now();
        System.out.printf("Days in month year %s: %d%n", currentYM, currentYM.lengthOfMonth());
    }
}
