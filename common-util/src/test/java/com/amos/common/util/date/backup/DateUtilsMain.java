package com.amos.common.util.date.backup;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DESCRIPTION: DateUtils
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/5/31
 * @since 1.6
 */
public class DateUtilsMain {

    private static final ThreadLocal<DateFormat> DATE_TIME =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    private static final ThreadLocal<DateFormat> DATE_TIME_SIMPLE =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMddHHmmss"));
    private static final ThreadLocal<DateFormat> DATE =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));
    private static final ThreadLocal<DateFormat> DATE_SIMPLE =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMdd"));


    public static void main(String[] args) {
        System.out.println("getDate:\t" + getDate());
        System.out.println("getDateSimple:\t" + getDateSimple());
        System.out.println("getDateTime:\t" + getDateTime());
        System.out.println("getDateTimeSimple:\t" + getDateTimeSimple());
    }

    /**
     * yyyy-MM-dd
     */
    public static String getDate() {
        return getDate(new Date(), true);
    }

    /**
     * yyyyMMdd
     */
    public static String getDateSimple() {
        return getDate(new Date(), false);
    }

    /**
     * yyyy-MM-dd HH:mm:ss
     */
    public static String getDateTime() {
        return getDateTime(new Date(), true);
    }

    /**
     * yyyyMMddHHmmss
     */
    public static String getDateTimeSimple() {
        return getDateTime(new Date(), false);
    }

    /**
     * 格式化日期加时间 by Date
     *
     * @param date      Date
     * @param delimiter 是否带分隔符
     *                  delimiter == true ? 'yyyy-MM-dd' : 'yyyyMMdd'
     * @return 格式化后的日期
     */
    private static String getDate(Date date, boolean delimiter) {
        if (delimiter) {
            return DATE.get().format(date);
        }
        return DATE_SIMPLE.get().format(date);
    }


    /**
     * 格式化日期加时间 by Date
     *
     * @param date      LocalDateTime
     * @param delimiter 是否带分隔符
     *                  delimiter == true ? 'yyyy-MM-dd HH:mm:ss' : 'yyyyMMddHHmmss'
     * @return 格式化后的日期
     */
    private static String getDateTime(Date date, boolean delimiter) {
        if (delimiter) {
            return DATE_TIME.get().format(date);
        }
        return DATE_TIME_SIMPLE.get().format(date);
    }

}
