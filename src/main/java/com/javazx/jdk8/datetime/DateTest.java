package com.javazx.jdk8.datetime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/8/30 1:48
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        /*Calendar c = Calendar.getInstance();
        c.setTime(date);
        String time = String.valueOf(c.get(Calendar.DAY_OF_MONTH));*/

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MONTH, 1);
        //DateFormat.getInstance("yyyyMMdd").format(c.getTime());
        System.out.println(c.toString());
        //-------------------------java8-----------------------------
        //LocalDate today = LocalDate.now();
        LocalDate today = LocalDate.of(2019, 1, 31);
        System.out.println(today.getDayOfMonth());

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate ld = today.plusMonths(1);
        String strDate2 = dtf2.format(ld);
        System.out.println(strDate2);

    }


}
