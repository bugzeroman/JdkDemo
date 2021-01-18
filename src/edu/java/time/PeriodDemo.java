package edu.java.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        calculateDate();
    }

    /**
     * 计算两个日期之间的年数，月数，天数。
     */
    private static void calculateDate() {
        LocalDate today = LocalDate.now();

        LocalDate java8Release = LocalDate.of(2018, 12, 14);

        Period period = Period.between(java8Release, today);
        System.out.println("Years Months Days passed after Java 8 release : " + period);

    }
}
