package com.coolk1ng.util;

import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.joda.time.Seconds;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * joda-time
 *
 * @author coolk1ng
 * @since 2022/10/20 00:49
 */
public class JodaTimeUtils {
    private final static Logger LOGGER = LoggerFactory.getLogger(JodaTimeUtils.class);

    public static void main(String[] args) {
        DateTime time = new DateTime();
        //设置日,月,年
        DateTime dateTime = time.withYear(1999).withMonthOfYear(5).withDayOfMonth(10).withHourOfDay(10).withMinuteOfHour(33).withSecondOfMinute(11);
        LOGGER.info("设置后的日期:{}",dateTime);

        // 日期格式转换
        DateTimeFormatter format = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        DateTime timeParse = DateTime.parse("2022-01-22 7:11:11", format);
        String s = timeParse.toString("yyyy-MM-dd");
        LOGGER.info("转换后的日期:{}",s);

        // 增加相应的时间
        DateTime plusDays = dateTime.plusDays(5);
        LOGGER.info("几天后的时间:{}",plusDays);

        // 得到相应部分的时间
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfYear());
        System.out.println(dateTime.getMonthOfYear());
        Seconds seconds = Seconds.seconds(55555);
        Hours hours = seconds.toStandardHours();
        System.out.println(hours);
    }
}
