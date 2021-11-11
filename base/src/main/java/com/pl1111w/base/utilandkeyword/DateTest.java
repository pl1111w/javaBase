package com.pl1111w.base.utilandkeyword;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/11/10 11:00
 */
public class DateTest {

    public static void main(String[] args) {
        String data = "2021-11-11 11:11:11";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse(data, dateTimeFormatter);
        System.out.println(date);

        LocalDateTime str = LocalDateTime.parse("2020-11-02T08:28:43.785", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS"));
        String time = dateTimeFormatter.format(str);
        System.out.println("格式化后标准时间:" + time);

        LocalDate localDate  = LocalDate.now();
        java.sql.Date date1 = java.sql.Date.valueOf(localDate);
        System.out.println(date1);

        java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(str);
        System.out.println(timestamp);
    }
}
