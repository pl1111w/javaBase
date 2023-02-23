package com.pl1111w.base.jdk8.timeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2023/2/21 11:55
 */
public class Jdk8LocalDateTime {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2022,2,22);
        LocalDate localDate1 = LocalDate.now();
        System.out.println("year:" + localDate1.getYear());
        System.out.println("month:" + localDate1.getMonth());
        System.out.println("month:" + localDate1.getMonthValue());
        System.out.println("day:" + localDate.getDayOfMonth());
        System.out.println("weekday:" + localDate.getDayOfWeek());
        System.out.println("weekday:" + localDate.getDayOfWeek().getValue());

        //change day month year
        LocalDate localDate2 = localDate1.withDayOfMonth(4);
        LocalDate localDate3 = localDate1.withYear(2222);
        LocalDate localDate4 = localDate1.withMonth(7);
        System.out.println(localDate2);
        System.out.println(localDate3);
        System.out.println(localDate4);

        //plus day month year
        LocalDate localDate5 = localDate1.plusDays(2);
        LocalDate localDate6 = localDate1.plusMonths(20);
        LocalDate localDate7 = localDate1.plusYears(1);
        LocalDate localDate8 = localDate1.plusWeeks(20);
        System.out.println(localDate5);
        System.out.println(localDate6);
        System.out.println(localDate7);
        System.out.println(localDate8);

        //judge date
        localDate7.isAfter(localDate8);
        localDate5.isBefore(localDate7);
        localDate6.isEqual(localDate8);

        //format
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //MM HH 要大写
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(localDateTime));

        //parse date
        String timeText = "2023-02-21 02:05:31";
        LocalDateTime parse = LocalDateTime.parse(timeText, formatter);
        System.out.println(parse);

        //compute seconds
        Duration duration = Duration.between(LocalDateTime.now(),parse);
        System.out.println("seconds gap:"+ duration.getSeconds());
        System.out.println("seconds gap:"+ duration.getNano());

        //compute year month days
        Period period = Period.between(localDate5,localDate);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Chicago"));
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime2);

    }
}
