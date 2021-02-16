package com.amos.common.util.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

/**
 * DESCRIPTION: DateUtils
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/5/31
 * @since 1.8
 */
public class DateUtils {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter DATE_SIMPLE_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final DateTimeFormatter DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter DATE_TIME_SIMPLE_FORMAT = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    private static final ZoneOffset ZONE_OFFSET = ZoneOffset.of("+8");
    private static final ZoneId ZONE_ID = ZoneId.systemDefault();

    /**
     * begin of the day
     */
    public static LocalDateTime begin(LocalDateTime localDateTime) {
        return LocalDateTime.of(localDateTime.toLocalDate(), LocalTime.MIN);
    }

    /**
     * end of the day
     */
    public static LocalDateTime end(LocalDateTime localDateTime) {
        return LocalDateTime.of(localDateTime.toLocalDate(), LocalTime.MAX);
    }


    /**
     * yyyy-MM-dd
     */
    public static String getDate() {
        return getDate(LocalDate.now());
    }

    public static String getDate(LocalDate localDate) {
        return Objects.isNull(localDate) ? null : getDate(localDate, true);
    }

    /**
     * yyyyMMdd
     */
    public static String getDateSimple() {
        return getDateSimple(LocalDate.now());
    }

    public static String getDateSimple(LocalDate localDate) {
        return Objects.isNull(localDate) ? null : getDate(localDate, false);
    }

    /**
     * yyyy-MM-dd HH:mm:ss
     */
    public static String getDateTime() {
        return getDateTime(LocalDateTime.now());
    }

    public static String getDateTime(LocalDateTime localDateTime) {
        return Objects.isNull(localDateTime) ? null : getDateTime(localDateTime, true);
    }

    public static String getDateTime(Date date) {
        return Objects.isNull(date) ? null : getDateTime(date.toInstant().atZone(ZONE_ID).toLocalDateTime());
    }

    /**
     * yyyyMMddHHmmss
     */
    public static String getDateTimeSimple() {
        return getDateTimeSimple(LocalDateTime.now());
    }

    public static String getDateTimeSimple(LocalDateTime localDateTime) {
        return Objects.isNull(localDateTime) ? null : getDateTime(localDateTime, false);
    }


    /**
     * format by LocalDate
     *
     * @param localDate LocalDate
     * @param delimiter have delimiter ?
     *                  delimiter == true ? 'yyyy-MM-dd' : 'yyyyMMdd'
     * @return Formatted date
     */
    private static String getDate(LocalDate localDate, boolean delimiter) {
        return delimiter ? localDate.format(DATE_FORMAT) : localDate.format(DATE_SIMPLE_FORMAT);
    }

    /**
     * format by LocalDateTime
     *
     * @param localDateTime LocalDateTime
     * @param delimiter     have delimiter ?
     *                      delimiter == true ? 'yyyy-MM-dd HH:mm:ss' : 'yyyyMMddHHmmss'
     * @return Formatted datetime
     */
    private static String getDateTime(LocalDateTime localDateTime, boolean delimiter) {
        return delimiter ? localDateTime.format(DATE_TIME_FORMAT) : localDateTime.format(DATE_TIME_SIMPLE_FORMAT);
    }

    /**
     * Get the current time seconds
     *
     * @return current time seconds
     */
    public static long getTimeSecond() {
        return Instant.now().getEpochSecond();
    }

    /**
     * LocalDateTime to timeMillis
     *
     * @param localDateTime LocalDateTime
     * @return time millis
     */
    public static Long toTimeMillis(LocalDateTime localDateTime) {
        return localDateTime.toInstant(ZONE_OFFSET).toEpochMilli();
    }

    /**
     * timeMillis to LocalDateTime
     *
     * @param timeMillis time millis
     * @return LocalDateTime
     */
    public static LocalDateTime toLocalDateTime(Long timeMillis) {
        return Instant.ofEpochMilli(timeMillis).atOffset(ZONE_OFFSET).toLocalDateTime();
    }

}
