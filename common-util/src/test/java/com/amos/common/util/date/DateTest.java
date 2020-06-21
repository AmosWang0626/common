package com.amos.common.util.date;

import java.time.LocalDateTime;

/**
 * DESCRIPTION: DateTest
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/5/31
 */
public class DateTest {

    public static void main(String[] args) {
        begin();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        end();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        format();
    }

    private static void begin() {
        System.out.println("begin:\t" + DateUtils.begin(LocalDateTime.now()));
    }

    private static void end() {
        System.out.println("end:\t" + DateUtils.end(LocalDateTime.now()));
    }

    private static void format() {
        System.out.println("getDate:\t" + DateUtils.getDate());
        System.out.println("getDateSimple:\t" + DateUtils.getDateSimple());
        System.out.println("getDateTime:\t" + DateUtils.getDateTime());
        System.out.println("getDateTimeSimple:\t" + DateUtils.getDateTimeSimple());
    }


}
