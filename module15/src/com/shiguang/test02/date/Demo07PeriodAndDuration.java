package com.shiguang.test02.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * Created By Shiguang On 2024/9/16 15:28
 */
public class Demo07PeriodAndDuration {
    public static void main(String[] args) {
//        period();
//        duration();
        parse();
    }

    private static void period() {
        LocalDate local1 = LocalDate.of(2022, 12, 12);
        LocalDate local2 = LocalDate.of(2021, 11, 11);

        Period period = Period.between(local2, local1);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }

    private static void duration() {
        LocalDateTime local1 = LocalDateTime.of(2022, 12, 12,12,12,12);
        LocalDateTime local2 = LocalDateTime.of(2021, 11, 11,11,11,11);
        Duration duration = Duration.between(local2, local1);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
    }

    private static void parse() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = "2000-10-10 10:10:10";
        TemporalAccessor temporalAccessor = dtf.parse(time);
//        System.out.println(temporalAccessor);
        LocalDateTime localDateTime = LocalDateTime.from(temporalAccessor);
        System.out.println("localDateTime = " + localDateTime);

        String formatTime = dtf.format(localDateTime);
        System.out.println("formatTime = " + formatTime);
    }
}
